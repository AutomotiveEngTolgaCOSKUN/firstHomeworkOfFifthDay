package homework6.business.concretes;

import homework6.business.abstracts.ValidityService;
import homework6.dataAccess.abstracts.MemberDao;
import homework6.entities.concretes.Member;

public class ValidityManager implements ValidityService {

	private MemberDao memberDao;

	public ValidityManager(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public boolean isValid(String email) {
		for (Member member : memberDao.getAll()) {

			if (email.equals(member.getEmail())) {
				System.out.println("Email Is Used.");
				return false;
			}
		}
		return true;
	}

}
