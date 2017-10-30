package com.baraccat.access;
import com.baraccat.services.*;

public class BusinessLogicDAO {
	
	private BankerRulesService bankerrules = new BankerRulesService();
	private DealService deal = new DealService();
	private PlayerRulesService playerrules = new PlayerRulesService();
	private PlayGame playgame = new PlayGame();
	private PlayService play= new PlayService();
	private StartGameService startgame = new StartGameService();
	private HardRuleService hardruleservice = new HardRuleService();
	private DrawCard drawcard = new DrawCard();

	
	
	public HardRuleService getHardruleservice() {
		return hardruleservice;
	}
	public void setHardruleservice(HardRuleService hardruleservice) {
		this.hardruleservice = hardruleservice;
	}
	public BankerRulesService getBankerrules() {
		return bankerrules;
	}
	public void setBankerrules(BankerRulesService bankerrules) {
		this.bankerrules = bankerrules;
	}
	public DealService getDeal() {
		return deal;
	}
	public void setDeal(DealService deal) {
		this.deal = deal;
	}
	public PlayerRulesService getPlayerrules() {
		return playerrules;
	}
	public void setPlayerrules(PlayerRulesService playerrules) {
		this.playerrules = playerrules;
	}
	public PlayGame getPlaygame() {
		return playgame;
	}
	public void setPlaygame(PlayGame playgame) {
		this.playgame = playgame;
	}
	public PlayService getPlay() {
		return play;
	}
	public void setPlay(PlayService play) {
		this.play = play;
	}
	public StartGameService getStartgame() {
		return startgame;
	}
	public void setStartgame(StartGameService startgame) {
		this.startgame = startgame;
	}
	public DrawCard getDrawcard() {
		return drawcard;
	}
	public void setDrawcard(DrawCard drawcard) {
		this.drawcard = drawcard;
	}
	

}
