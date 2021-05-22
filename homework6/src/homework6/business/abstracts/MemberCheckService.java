package homework6.business.abstracts;

public interface MemberCheckService {

	boolean emailCheck(String email);

	boolean firstNameCheck(String firstName);

	boolean lastNameCheck(String lastName);

	boolean passwordCheck(String password);

}
