package homework6.business.concretes;

import java.util.List;

import homework6.business.abstracts.MemberCheckService;
import homework6.business.abstracts.MemberService;
import homework6.business.abstracts.ValidityService;
import homework6.core.abstracts.OutherService;
import homework6.dataAccess.abstracts.MemberDao;
import homework6.entities.concretes.Member;

public class MemberManager implements MemberService {

	private MemberCheckService memberCheckService;

	private MemberDao memberDao;

	private OutherService outherService;

	public MemberManager(MemberCheckService memberCheckService, MemberDao memberDao, OutherService outherService) {
		this.memberCheckService = memberCheckService;
		this.memberDao = memberDao;
		this.outherService = outherService;
	}

	@Override
	public void register(Member member) {
		ValidityService validityService = new ValidityManager(memberDao);
		if (validityService.isValid(member.getEmail()) && memberCheckService.emailCheck(member.getEmail())
				&& memberCheckService.firstNameCheck(member.getFirstName())
				&& memberCheckService.lastNameCheck(member.getLastName())
				&& memberCheckService.passwordCheck(member.getPassword())) {

			memberDao.add(member);
			outherService.enterToSystem();
			System.out.println("A Vertification Email Has Been Sent To " + member.getEmail());
			System.out.println(member.getFirstName() + member.getLastName() + "Completing Your Membership");

		}
		System.out.println(" ");

	}

	@Override
	public void logIn(String eMail, String password) {
		for (int i = 0; i < memberDao.getAll().size(); i++) {
			if (memberDao.getAll().get(i).getEmail().equals(eMail)
					&& memberDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Entering Successful.");
				System.out.println("  ");
				return;
			}
		}

		System.out.println("E-mail or Password Wrong");
		System.out.println("  ");

	}

	@Override
	public List<Member> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
