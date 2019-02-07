package Cards;
public class Card {
	
	private String face;{
		
		String[] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};  
	}
	private String suit;{
		String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	}
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	public String getFace() {
		return this.face;
	}
	public String getSuit() {
		return this.suit;
	}
}
