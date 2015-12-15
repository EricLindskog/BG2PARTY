package party;

public class SponsorPerson extends Person{
	private final Sponsor organization;
	SponsorPerson(String name,Sex sex, Sponsor organization) {
		super(name,sex); this.organization = organization;
	} 
	Sponsor getOrganization() { 
		return organization;
	}

}
