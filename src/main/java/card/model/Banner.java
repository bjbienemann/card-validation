package card.model;

import card.validation.AmexCard;
import card.validation.Card;
import card.validation.DinersCard;
import card.validation.MasterCard;
import card.validation.VisaCard;

/**
 * 
 * @author Brian Bienemann
 * This enum is a Factory of Objects
 * Refactoring technique for Replace Conditional with Polimorphism.
 */
public enum Banner {
	
	UNINFORMED {
		@Override
		public Card createCard(String number, String valitily) {
			return null;
		}
	},
	VISA {
		@Override
		public Card createCard(String number, String valitily) {
			return new VisaCard(number, valitily);
		}
	},
	MASTERCARD {
		@Override
		public Card createCard(String number, String valitily) {
			return new MasterCard(number, valitily);
		}
	},
	AMEX{
		@Override
		public Card createCard(String number, String valitily) {
			return new AmexCard(number, valitily);
		}
	},
	DINERS{
		@Override
		public Card createCard(String number, String valitily) {
			return new DinersCard(number, valitily);
		}
	};
	
	public abstract Card createCard(String number, String valitily);
}
