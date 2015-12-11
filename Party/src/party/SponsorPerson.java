package party;

public class SponsorPerson extends Person{
	private final Sponsor organization;
	SponsorPerson(String name, Sponsor organization) {
		super(name); this.organization = organization;
	} 
	Sponsor getOrganization() { 
		return organization;
	}

}
