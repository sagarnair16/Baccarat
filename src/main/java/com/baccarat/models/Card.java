package com.baccarat.models;

public class Card {
	
	String deckid;
	String suit;
	int value;
	
	Card(String id){
		setDeckid(id);
	}

	public String getDeckid() {
		return deckid;
	}

	public void setDeckid(String deckid) {
		this.deckid = deckid;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deckid == null) ? 0 : deckid.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (deckid == null) {
			if (other.deckid != null)
				return false;
		} else if (!deckid.equals(other.deckid))
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	
}
