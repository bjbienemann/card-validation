package card.validation.mock;

import card.validation.Card;
import card.validation.VisaCard;

public class VisaCardMock {
	
	private Card validCard;
	private Card invalidDateCard;
	private Card invalidFormatCard;
	private Card invalidNumberCard;
	
	public VisaCardMock() {
		validCard = new VisaCard("4716 4974 7886 1656", "08/2020");
		invalidDateCard = new VisaCard("4716 4974 7886 1656", "08/2010");
		invalidFormatCard = new VisaCard("3008 899244 5170", "08/2020");
		invalidNumberCard = new VisaCard("4716 4974 7786 1656", "08/2020");
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
