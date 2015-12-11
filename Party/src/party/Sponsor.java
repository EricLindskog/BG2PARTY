package party;

public class Sponsor {
	private final String name; 
	Sponsor(String name) { 
		this.name = name;
	} 
	@Override
	public String toString() {
		return name; 
	} 
	@Override 
	public int hashCode() {
		return name.hashCode();
	}

}
