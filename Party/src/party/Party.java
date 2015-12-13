package party;

import java.util.HashMap;
import java.util.Map;

public class Party {
	private String partyName; 
	private int maxGuests; 
	private Money entranceFee; 
	private Map<Person, Boolean> guests;
	private Map<Sponsor, Money> sponsors; 
	Party(String partyName, int maxGuests, Money entranceFee) { 
		this.partyName = partyName;
	
		this.maxGuests = maxGuests;
		this.entranceFee = entranceFee; 
		this.guests = new HashMap<Person, Boolean>(); 
		this.sponsors = new HashMap<Sponsor, Money>();
	} 
	void addGuest(Person guest) { 
		addGuest(guest, false); } 
	void addGuest(Person guest, boolean hasPaid) { 
		guests.put(guest, hasPaid); 
	} 
	void pay(Person guest) { 
		//har ingen kropp �n. Implementera kroppen med l�mplig felhantering. 
		//Vid fel ska undantag kastas.
		
		//Skrivs av albin

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
	/*
	 * H�r skall Daniel Holmberg skriva en �verlagring f�r add sponsor
	 */
	public void print() { 
		// Skrivs av Samuel enligt beskrivning
	}
	
	
	

}
