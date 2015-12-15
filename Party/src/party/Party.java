package party;

import java.util.HashMap;
import java.util.Map;

public class Party {
	private String partyName; 
	private int maxGuests; 
	private Money entranceFee; 
	private Map<Person, Boolean> guests;
	private Map<Sponsor, Money> sponsors; 
	private Map<String, Double> spons;
	Party(String partyName, int maxGuests, Money entranceFee) { 
		this.partyName = partyName;
	
		this.maxGuests = maxGuests;
		this.entranceFee = entranceFee; 
		this.guests = new HashMap<Person, Boolean>(); 
		this.sponsors = new HashMap<Sponsor, Money>();
		//This is TEST!!
		
		
	} 
	void addGuest(Person guest) { 
		addGuest(guest, false); } 
	void addGuest(Person guest, boolean hasPaid) { 
		guests.put(guest, hasPaid); 
	} 
	void pay(Person guest) { 
		
		try
		{
			guests.remove(guest);
			addGuest(guest, true);
		}
		catch(Exception e){}
		

	}
	boolean hasPaid(Person guest) throws NoSuchPersonException { 
		if(guests.containsKey(guest)) { 
			return guests.get(guest); 
		} else { 
			throw new NoSuchPersonException();
		}
	}
	void addSponsor(Sponsor sponsor, Money amount) { 
		sponsors.put(sponsor, amount); 
	}
<<<<<<< HEAD
	void addSponsor(String sponsor, double amount){
		Sponsor x = new Sponsor(sponsor);
		Money y = new Money(amount);
		
		addSponsor(x,y);
	}
=======
	/*
	 * H�r skall Daniel Holmberg skriva en �verlagring f�r add sponsor
	 */
>>>>>>> origin/master
	public void print() { 
		// Skrivs av Samuel enligt beskrivning
	}
	
	
	

}
