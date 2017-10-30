package com.baraccat.services;

import com.baccarat.models.Coup;

public class HardRuleService {
	
	public static Coup hardRules(Coup coup){
		
			if(coup.getBanker().getTotal()>coup.getPlayer().getTotal()){
				coup.setWinner("Banker");
				return coup;
			}
			else if(coup.getBanker().getTotal()<coup.getPlayer().getTotal())
			{
				coup.setWinner("Player");
				return coup;
			}
			else if(coup.getBanker().getTotal()==coup.getPlayer().getTotal()){
				coup.setWinner("Tie");
				return coup;
			}
			
			return coup;
		
	}

}
