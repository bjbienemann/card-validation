package card.exception;

import card.validation.Card;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Error Code with Exception
 */
public class InvalidNumberException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidNumberException(Card card) {
		super(card.getNumber());
	}

	
}
