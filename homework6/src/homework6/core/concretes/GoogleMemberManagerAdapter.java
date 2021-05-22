package homework6.core.concretes;

import homework6.core.abstracts.OutherService;

public class GoogleMemberManagerAdapter implements OutherService {

	@Override
	public void enterToSystem() {
		GoogleMemberManager googleMember = new GoogleMemberManager();
		googleMember.register();

	}

}
