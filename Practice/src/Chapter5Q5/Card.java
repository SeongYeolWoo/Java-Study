package Chapter5Q5;

public class Card {
	private int cardNumber;
	private static int serialNum = 10001; 
	Card(){
		this.cardNumber = serialNum;
		serialNum++;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
}
