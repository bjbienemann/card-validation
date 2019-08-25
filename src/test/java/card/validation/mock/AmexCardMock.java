package card.validation.mock;

import card.validation.AmexCard;
import card.validation.Card;

public class AmexCardMock {
	
	private Card validCard;
	private Card invalidDateCard;
	private Card invalidFormatCard;
	private Card invalidNumberCard;
	
	public AmexCardMock() {
		validCard = new AmexCard("3463 120195 05504", 6, 2020);
		invalidDateCard = new AmexCard("3463 120195 05504", 5, 2019);
		invalidFormatCard = new AmexCard("4716 4974 7886 1656", 6, 2020);
		invalidNumberCard = new AmexCard("3463 123195 05504", 6, 2020);
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
