package party;

public abstract class Person {
	private final String name; 
	private final Sex sex;
	
	public Person(String name, Sex sex){
		this.sex = sex;
		this.name = name; 
	} 
	public String getName() {
		return name; 
	} 
	
	public Sex getSex(){
		return this.sex;
	}
	@Override public int hashCode() { 
		return name.hashCode();
	}
}
