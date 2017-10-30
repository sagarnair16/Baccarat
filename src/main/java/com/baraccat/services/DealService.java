package com.baraccat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.baccarat.models.Card;
import com.baccarat.models.Coup;
import com.baccarat.models.Deck;
import com.baccarat.models.User;

public class DealService {
	
	public static ArrayList<Card> Deal(Coup coup, User user){
		Random generator = new Random();
		ArrayList<Deck> al = new ArrayList<Deck>(coup.getShoe().getDecklist());
		ArrayList<Card> dealtcards= new ArrayList<>();
		int i=0;
		while(i<2){
			Deck randomdeck = al.get(generator.nextInt(8));
			List<Card> listofcard = randomdeck.getDeckofcards();
			Card card = listofcard.get(generator.nextInt(listofcard.size()));
			dealtcards.add(card);
			listofcard.remove(card);
			i++;
		}
		
		if(user.getType().equals("Player")){
			coup.setPlayer(user);
			coup.getPlayer().setDealtcard(dealtcards);
			return coup.getPlayer().getDealtcard();
		}
		else{
			coup.setBanker(user);
			coup.getBanker().setDealtcard(dealtcards);
			return coup.getBanker().getDealtcard();
		} 
		
		
		
	}
}
