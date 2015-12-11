package party;

public class Money implements Cloneable{
	double amount;
	Money(double amount) { 
		if(amount < 0.0) { 
			throw new IllegalArgumentException();
		}
		else {
			this.amount = amount;
		}
	} 
	@Override 
	protected Money clone() {
		try { 
			return (Money)super.clone(); 
		} 
		catch(CloneNotSupportedException e) { 
			throw new AssertionError(); // Should never happen
		}
	}
	@Override 
	public String toString() { 
		return Double.toString(amount); 
	}
}
