package com.baraccat.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.baccarat.models.Card;
import com.baccarat.models.Coup;
import com.baccarat.models.Deck;

public class BankerRulesService {

	public static Coup bankerRules(Coup coup){
		int bankertotal = coup.getBanker().getTotal();
		if(bankertotal<=5){
			coup.setBankerstand(false);
		}
		else coup.setBankerstand(true);
		return coup;	
		}
	
}
