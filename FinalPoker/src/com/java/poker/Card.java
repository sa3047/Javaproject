package com.java.poker;

/* An implementation of Card type
 * @author: Swapnil Aher
 * @since: 3/15/2015
 * */
public class Card implements Comparable<Card> {

	//private variables
	private int cardValue;
	private Suit suit;
	
	public Card(Suit suit, int cardValue){
		this.suit=suit;
		if(cardValue>=1 && cardValue<=13)
		{
			this.cardValue = cardValue;	
		}
		else
		{
			System.out.println("Invalid Card value exception");
			
			//throw invalid card value exception
			//Need to create this Exception class
		}
	}
	
	public int getCardValue(){
		return cardValue;
	}
	
   public Suit getSuit(){
	   return this.suit;
   }
	
	 /* Print card value and suit type which it belongs
	 * */
   @Override
	public String toString() {
		if (cardValue >= 2 && cardValue <= 10)
			return cardValue + " of " + suit.toString();

		if (cardValue == 1)
			return "Ace of " + suit.toString();

		if (cardValue == 11)
			return "Jack of " + suit.toString();

		if (cardValue == 12)
			return "Queen of " + suit.toString();

		if (cardValue == 13)
			return "King of " + suit.toString();

		return null;
	}

   @Override
	public int compareTo(Card o) {
		if (this.cardValue == (o.cardValue))
			return 0;
		else if ((this.cardValue) > (o.cardValue))
			return 1;
		else
			return -1;
	}
   
}
