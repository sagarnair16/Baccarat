package com.baccarat.controllers;


import com.baccarat.models.*;
import com.baraccat.services.BankerRulesService;
import com.baraccat.services.DealService;
import com.baraccat.services.DrawCard;
import com.baraccat.services.HardRuleService;
import com.baraccat.services.PlayService;
import com.baraccat.services.PlayerRulesService;
import com.baraccat.services.StartGameService;
import com.baraccat.access.*;

public class Game {
	
	private static BusinessLogicDAO businesslogic = new BusinessLogicDAO();
	
	public Coup startGame(){
		businesslogic.getStartgame();
		Coup coup=StartGameService.startGame();
		return coup;
	}
	
	public Coup Deal(Coup coup,User user){
		businesslogic.getDeal();
		DealService.Deal(coup, user);
		return coup;
	}
	
	public Coup Play(Coup coup){
		businesslogic.getPlay();
		PlayService.play(coup);
		return coup;
	}
	
	public Coup playerRules(Coup coup){
		businesslogic.getPlayerrules();
		PlayerRulesService.playerRules(coup);
		return coup;
	}
	
	public Coup bankerRules(Coup coup){
		businesslogic.getBankerrules();
		BankerRulesService.bankerRules(coup);
		return coup;
	}
	
	public Coup drawCard(Coup coup, User user){
		businesslogic.getDrawcard();
		DrawCard.draw(coup,user);
		return coup;
	}
	
	public Coup decideWinner(Coup coup){
		businesslogic.getHardruleservice();
		HardRuleService.hardRules(coup);
		return coup;
	}
	
	
}
