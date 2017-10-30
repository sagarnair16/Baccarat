package com.baccarat;

import java.util.List;

import com.baccarat.controllers.Game;
import com.baccarat.models.*;

public class App 
{
	private static Coup coup;
	
    public static void main( String[] args )
    {
    	//Start Coup
    	Game game = new Game();
    	coup=game.startGame();
    	boolean doesplayerstand=true;
    	boolean doesbankerstand=true;
    	
    	//Deal player
    	coup=game.Deal(coup, new User("Player"));
    	List<Card> dealtcardsplayer=coup.getPlayer().getDealtcard();
    	for(Card c:dealtcardsplayer) System.out.println(c.getSuit()+" "+c.getValue());
    	
    	//Deal banker
    	coup=game.Deal(coup, new User("Banker"));
    	List<Card> dealtcardsbanker=coup.getBanker().getDealtcard();
    	for(Card c:dealtcardsbanker) System.out.println(c.getSuit()+" "+c.getValue());
    	
    	//play the game
    	coup=game.Play(coup);
    	if(coup.getWinner()!=null){
    		System.out.println("Winner is "+coup.getWinner());
    		System.exit(0);
    		}
    	
    	//If no winner play player rule
    	if(coup.getWinner()==null){
    		coup=game.playerRules(coup);
    		doesplayerstand=coup.isPlayerstand();
    		System.out.println("player stands :"+doesplayerstand);
    	}
    	
    	//if player does not stand player rules
    	if(!doesplayerstand && coup.getWinner()==null){
    		coup=game.drawCard(coup, coup.getPlayer());
    		System.out.println("player total "+coup.getPlayer().getTotal());
    	}
    	//if player stands banker rules
    	else if(doesplayerstand && coup.getWinner()==null){
    		coup=game.bankerRules(coup);
    		doesbankerstand=coup.isBankerstand();
    		System.out.println("Banker stands :"+doesbankerstand);
    	}
    	
    	if(!doesbankerstand && coup.getWinner()==null){
    		coup=game.drawCard(coup, coup.getBanker());
    		System.out.println("Banker total "+coup.getBanker().getTotal());
    	}
    	
    	coup=game.Play(coup);
    	
    	if(coup.getWinner()!=null){
    		System.out.println("Winner is "+coup.getWinner());
    		System.exit(0);
    	}
    	else{
    			if(coup.getBanker().getTotal()<=2){
        			coup=game.drawCard(coup, coup.getBanker());
        			System.out.println("Player drew a card but banker has a total of 2 or less");
        			System.out.println("Banker total: "+coup.getBanker().getTotal());
        		}
    			else if(coup.getBanker().getTotal()==3 && coup.getPlayersthirdcard()!=8){
        			coup=game.drawCard(coup, coup.getBanker());
        			System.out.println("Player drew a card but banker has a total of 3 and player did not have 8");
        			System.out.println("Banker total: "+coup.getBanker().getTotal());
    			}
    			else if(coup.getBanker().getTotal()==4 && coup.getPlayersthirdcard()<8 && coup.getPlayersthirdcard()>1){
        			coup=game.drawCard(coup, coup.getBanker());
        			System.out.println("Player drew a card but banker has a total of 4 and player 3rd card was "+ coup.getPlayersthirdcard());
        			System.out.println("Banker total: "+coup.getBanker().getTotal());
    			}
    			else if(coup.getBanker().getTotal()==5 && coup.getPlayersthirdcard()<8 && coup.getPlayersthirdcard()>3){
        			coup=game.drawCard(coup, coup.getBanker());
        			System.out.println("Player drew a card but banker has a total of 5 and player 3rd card was "+coup.getPlayersthirdcard());
        			System.out.println("Banker total: "+coup.getBanker().getTotal());
    			}
    			else if(coup.getBanker().getTotal()==6 && coup.getPlayersthirdcard()<8 && coup.getPlayersthirdcard()>5){
        			coup=game.drawCard(coup, coup.getBanker());
        			System.out.println("Player drew a card but banker has a total of 6 and player 3rd card was "+coup.getPlayersthirdcard());
        			System.out.println("Banker total: "+coup.getBanker().getTotal());
    			}
    			
    			coup=game.decideWinner(coup);
    	}
    	
    	System.out.println(coup.getWinner());
    	
    	
    }
    	

}
