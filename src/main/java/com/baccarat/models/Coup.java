package com.baccarat.models;
import java.util.UUID;

public class Coup {
	
	private String id;
	private User player=null;
	private User banker=null;
	private Shoe shoe=null;
	private String winner=null;
	private boolean playerstand;
	private boolean bankerstand;
	private boolean result;
	private int playersthirdcard;
	
	
	
	public int getPlayersthirdcard() {
		return playersthirdcard;
	}
	public void setPlayersthirdcard(int playersthirdcard) {
		this.playersthirdcard = playersthirdcard;
	}
	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
	public Coup(){
		setId(UUID.randomUUID().toString());
		setShoe(id);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getPlayer() {
		return player;
	}
	public void setPlayer(User player) {
		this.player = player;
	}
	public User getBanker() {
		return banker;
	}
	public void setBanker(User banker) {
		this.banker = banker;
	}
	public Shoe getShoe() {
		return shoe;
	}
	public void setShoe(String id) {
		this.shoe = new Shoe(id);
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	public boolean isPlayerstand() {
		return playerstand;
	}
	public void setPlayerstand(boolean playerstand) {
		this.playerstand = playerstand;
	}
	public boolean isBankerstand() {
		return bankerstand;
	}
	public void setBankerstand(boolean bankerstand) {
		this.bankerstand = bankerstand;
	}



}
