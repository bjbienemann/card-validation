package card.validation.mock;

import card.validation.Card;
import card.validation.DinersCard;

public class DinersCardMock {
	
	private Card validCard;
	private Card invalidDateCard;
	private Card invalidFormatCard;
	private Card invalidNumberCard;
	
	public DinersCardMock() {
		validCard = new DinersCard("3008 899244 5170", "09/2020");
		invalidDateCard = new DinersCard("3008 899244 5170", "05/2019");
		invalidFormatCard = new DinersCard("5372 9982 2946 7737", "09/2020");
		invalidNumberCard = new DinersCard("3008 899944 5170", "09/2020");
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
