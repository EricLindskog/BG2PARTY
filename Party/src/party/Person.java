package party;

public abstract class Person {
	private final String name; 
	public Person(String name){
		this.name = name; 
	} 
	public String getName() {
		return name; 
		
	} 
	@Override public int hashCode() { 
		return name.hashCode();
	}
}
