package homework6.dataAccess.abstracts;

import java.util.List;

import homework6.entities.concretes.Member;

public interface MemberDao {

	public void register(Member member);

	void logIn(Member member);

	void logOut(Member member);

	Member get(int id);

	List<Member> getAll();

	void add(Member member);

	void update(Member member);

	void delete(Member member);

}
