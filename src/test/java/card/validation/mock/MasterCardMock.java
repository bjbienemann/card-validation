package card.validation.mock;

import card.validation.Card;
import card.validation.MasterCard;

public class MasterCardMock {
	
	private Card validCard;
	private Card invalidDateCard;
	private Card invalidFormatCard;
	private Card invalidNumberCard;
	
	public MasterCardMock() {
		validCard = new MasterCard("5372 9982 2946 7737", "05/2020");
		invalidDateCard = new MasterCard("5372 9982 2946 7737", "05/2018");
		invalidFormatCard = new MasterCard("3463 120195 05504", "05/2020");
		invalidNumberCard = new MasterCard("5372 9082 2946 7737", "05/2020");
	}
	
	public Card getValidCard() {
		return validCard;
	}
	
	public Card getInvalidDateCard() {
		return invalidDateCard;
	}

	public Card getInvalidFormatCard() {
		return invalidFormatCard;
	}

	public Card getInvalidNumberCard() {
		return invalidNumberCard;
	}
	
}
