package party;

public abstract class Person {
	private final String name; 
	private final Sex sex;
	private GuestToStudent slave;
	
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
	
	public void addSlave(GuestToStudent slave) {
		this.slave = slave;
	}
	
	public GuestToStudent getSlave() {
		return slave;
	}
	
	@Override public int hashCode() { 
		return name.hashCode();
	}
}
