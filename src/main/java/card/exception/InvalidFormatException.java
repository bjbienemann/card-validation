package card.exception;

import card.validation.Card;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Error Code with Exception
 */
public class InvalidFormatException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidFormatException(Card card) {
		super(card.getNumber());
	}
}
