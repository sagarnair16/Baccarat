package com.baccarat.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Shoe {

 private static String shoeid; 
 private static String coupid;
 private static Deck deck;
 private static List<Deck> decklist;
	
	
	
	public Shoe(String id){
		setShoeid(UUID.randomUUID().toString());
		setCoupid(id);
		setDecklist();
	}
	public static String getCoupid() {
		return coupid;
	}

	public static void setCoupid(String coupid) {
		Shoe.coupid = coupid;
	}

	public static String getShoeid() {
		return shoeid;
	}
	public static void setShoeid(String shoeid) {
		Shoe.shoeid = shoeid;
	}
	public static void setDecklist( List<Deck> decklist) {
		Shoe.decklist = decklist;
	}
	
	public static Deck getDeck() {
		return deck;
	}

	public static void setDeck(Deck deck) {
		Shoe.deck = deck;
	}

	public static List<Deck> getDecklist() {
		return decklist;
	}

	public static void setDecklist() {
		decklist = new ArrayList<>();
		for(int i=0;i<8;i++)
			decklist.add(new Deck(shoeid));
	}


}
