package homework6;

import homework6.business.concretes.MemberCheckManager;
import homework6.business.concretes.MemberManager;
import homework6.core.concretes.NoAdapter;
import homework6.dataAccess.concretes.HibernateMemberDao;
import homework6.entities.concretes.Member;

public class Main {

	public static void main(String[] args) {
		Member member1 = new Member(1, "Tolga", "COSKUN", "t.tolgacoskun@gmail.com", "19634587er");
		Member member2 = new Member(2, "T", "COSKUN", "t.tolgacoskun@gmail.com", "19634587er");
		Member member3 = new Member(3, "Tolga", "C", "t.tolgacoskun@gmail.com", "19634587er");
		Member member4 = new Member(4, "Tolga", "COSKUN", " ", "19634587er");
		Member member5 = new Member(5, "Tolga", "COSKUN", "t.tolgacoskun@gmail.com", "19634");
		Member member6 = new Member(6, "Kadir", "TURNA", "t.tolgacoskun@gmail.com", "19634587er");
		Member member7 = new Member(7, "Psiko", "KOCA", "t.tolgacoskun@hotmail.com", " ");
		Member member8 = new Member(8, "Fatih", "KASAP", "t.tolgacoskun@gmail.com", "19634587er");
		Member member9 = new Member(9, "Burak", "BAS", "t.tolgacoskun@gmail.com", "19634587er");

		MemberManager memberManager = new MemberManager(new MemberCheckManager(), new HibernateMemberDao(),
				new NoAdapter());

		memberManager.register(member1);
		memberManager.register(member2);
		memberManager.register(member3);
		memberManager.register(member4);
		memberManager.register(member5);
		memberManager.register(member6);
		memberManager.register(member7);
		memberManager.register(member8);
		memberManager.register(member9);

		memberManager.register(member9);
		memberManager.logIn("Tolga", "COSKUN");
		memberManager.logIn("t.tolgacoskun@gmail.com", "16587498894");

	}

}
