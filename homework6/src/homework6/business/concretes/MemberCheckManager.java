package homework6.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework6.business.abstracts.MemberCheckService;

public class MemberCheckManager implements MemberCheckService {

	@Override
	public boolean emailCheck(String email) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		} else if (email.isEmpty()) {
			System.out.println("Enter Your E-mail");
			return false;
		} else {
			System.out.println("Invalid E-mail Address");
			return false;
		}

	}

	@Override
	public boolean firstNameCheck(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("Your First Name Mustn't Short Than Two Characters!");
			return false;
		}
		return true;
	}

	@Override
	public boolean lastNameCheck(String lastName) {
		if (lastName.length() < 2) {
			System.out.println("Your Last Name Mustn't Short Than Two Characters!");

			return false;
		}
		return true;

	}

	@Override
	public boolean passwordCheck(String password) {

		if (password.isEmpty()) {
			System.out.println("Enter Password.");

		}

		else if (password.length() < 6) {
			System.out.println("Your Password Mustn't Short Than Six Characters!");
			return false;
		}
		return true;

	}

}
