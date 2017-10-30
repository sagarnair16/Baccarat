package com.baccarat.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Deck {
	
	private static String deckid;
	private static String shoeid;
	private static final String[] suit = {"Heart","Club","Spade","Diamond"};
	private static final int[] value = {1,2,3,4,5,6,7,8,9,-1,-2,-3,-4};
	private List<Card> deckofcards = null;
	
	Deck(String id){
		Deck.shoeid=id;
		setDeckid(UUID.randomUUID().toString());
		setNewDeck();
	}
	
	public static String getDeckid() {
		return deckid;
	}

	public static void setDeckid(String deckid) {
		Deck.deckid = deckid;
	}

	public static String getShoeid() {
		return shoeid;
	}

	public static void setShoeid(String shoeid) {
		Deck.shoeid = shoeid;
	}

	public List<Card> getDeckofcards() {
		return deckofcards;
	}

	public void setDeckofcards(List<Card> deckofcards) {
		this.deckofcards = deckofcards;
	}

	public static String[] getSuit() {
		return suit;
	}

	public static int[] getValue() {
		return value;
	}

	
	public void setNewDeck(){	
		deckofcards = new ArrayList<Card>();
		for(String s:suit)
			for(int i:value){
				Card card = new Card(deckid);
				card.setSuit(s);
				card.setValue(i);
				deckofcards.add(card);
			}
		
	}

}
