package homework6.business.abstracts;

import java.util.List;

import homework6.entities.concretes.Member;

public interface MemberService {

	void register(Member member);

	void logIn(String eMail, String password);

	List<Member> getAll();

}
