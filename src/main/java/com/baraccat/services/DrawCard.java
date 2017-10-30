package com.baraccat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.baccarat.models.Card;
import com.baccarat.models.Coup;
import com.baccarat.models.Deck;
import com.baccarat.models.User;

public class DrawCard {
	
	public static Coup draw(Coup coup, User user){
		Random generator = new Random();
		ArrayList<Deck> al = new ArrayList<Deck>(coup.getShoe().getDecklist());
		ArrayList<Card> dealtcards;
		if(user.getType().equals("Player")) dealtcards= coup.getPlayer().getDealtcard();
		else dealtcards= coup.getBanker().getDealtcard();

		Deck randomdeck = al.get(generator.nextInt(8));
		List<Card> listofcard = randomdeck.getDeckofcards();
		Card card = listofcard.get(generator.nextInt(listofcard.size()));
		System.out.println("Drawn card for "+user.getType()+" "+card.getSuit()+" "+card.getValue());
		dealtcards.add(card);
		listofcard.remove(card);
		
		if(user.getType().equals("Player")) {
			coup.getPlayer().setDealtcard(dealtcards);
			coup.setPlayersthirdcard(card.getValue());
		}
		else coup.getBanker().setDealtcard(dealtcards);
		
		return coup;
	}

}
