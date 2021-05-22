package homework6.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework6.dataAccess.abstracts.MemberDao;
import homework6.entities.concretes.Member;

public class HibernateMemberDao implements MemberDao {

	private List<Member> members;

	public HibernateMemberDao() {
		this.members = new ArrayList<Member>();
	}

	@Override
	public void register(Member member) {
		System.out.println("Member Registration Successful " + member.getFirstName() + " " + member.getLastName() + " "
				+ member.getEmail());

	}

	@Override
	public void logIn(Member member) {
		System.out.println(
				"Login Successful " + member.getFirstName() + " " + member.getLastName() + " " + member.getEmail());

	}

	@Override
	public void logOut(Member member) {
		System.out.println("Please Enter User Name");

	}

	@Override
	public Member get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getAll() {
		// TODO Auto-generated method stub
		return this.members;
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub

	}

}
