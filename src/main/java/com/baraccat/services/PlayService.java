package com.baraccat.services;

import com.baccarat.models.Coup;
import com.baccarat.models.User;

public class PlayService {

public static Coup play(Coup coup){
		
		User player=coup.getPlayer();
		User banker=coup.getBanker();
		
		if(player.getTotal()<8 && banker.getTotal()<8){
			coup.setResult(false);
		}
		else if(player.getTotal()>7 && banker.getTotal()>7){
			if(player.getTotal()>banker.getTotal())
				coup.setWinner("Player");
			else if(player.getTotal()<banker.getTotal())
				coup.setWinner("Banker");
			else coup.setWinner("Tie");
			coup.setResult(true);
		}
		else if(player.getTotal()>7 && banker.getTotal()<8){
			coup.setWinner("Player");
			coup.setResult(true);
		}
		else if(banker.getTotal()>7 && player.getTotal()<8){
			coup.setWinner("Banker");
			coup.setResult(true);
		}
		
		coup.setResult(true);
		return coup;
		
	}
}
