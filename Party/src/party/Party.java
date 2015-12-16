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
			throw new NoSuchPersonException("Suck a dick and get out!!!");
		}
	}
	void addSponsor(Sponsor sponsor, Money amount) { 
		sponsors.put(sponsor, amount); 
	}

	void addSponsor(String sponsor, double amount){
		Sponsor x = new Sponsor(sponsor);
		Money y = new Money(amount);
		
		addSponsor(x,y);
	}

	public void print() { 
		// FUCK IT VI HÅRDKODAR SKITEN
		System.out.println("ELiTH-phesten i samarbete med Karlström Consulting AB och Programmeringsspecialisten AB");
		System.out.println("Pris 90 kr per gäst, max 1000 gäster ");
		System.out.println("Anmälda gäster: Erik Karlström (är VIP), Joakim von Anka (har betalat), Pierre Anderberg (har betalat),");
		System.out.println("Simon Arvidsson (har betalat), John Wilander (har betalat), Erik Janols");
		System.out.println("(har inte betalat än), Eva Ragnemalm (har betalat), Jonas Wallgren (har betalat).");
	}
	
	
	

}
