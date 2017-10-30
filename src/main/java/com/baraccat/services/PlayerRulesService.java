package com.baraccat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.baccarat.models.Card;
import com.baccarat.models.Coup;
import com.baccarat.models.Deck;

public class PlayerRulesService {

	public static Coup playerRules(Coup coup){
		int playertotal = coup.getPlayer().getTotal();
		if(playertotal<=5){
			coup.setPlayerstand(false);
		}
		else coup.setPlayerstand(true);
		
		return coup;
	}
	

	
}
