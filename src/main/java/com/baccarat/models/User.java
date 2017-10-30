package com.baccarat.models;

import java.util.ArrayList;
import java.util.UUID;

public class User {
	
	private String id;
	private String type;
	private ArrayList<Card> dealtcard;
	private int total;
	
	public User(String type){
		setType(type);
		setId(UUID.randomUUID().toString());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<Card> getDealtcard() {
		return dealtcard;
	}
	public void setDealtcard(ArrayList<Card> dealtscard) {
		this.dealtcard = dealtscard;
		setTotal();
	}
	
	public void initializeTotalForTest(int total){
		this.total=total;
	}

	public int getTotal() {
		return this.total;
	}
	
	public void testTotal(int total){
		this.total=total;
	}

	public void setTotal() {
			int sum=0;
			for(Card c: this.getDealtcard()){
				if(c.value>=0)
					sum+=c.value;
				else sum+=0;
			}
				
			if(sum<10)
			this.total=sum;
			else this.total=sum%10;
	}
	
	
}
