package card.exception;

import card.validation.Card;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Error Code with Exception
 */
public class InvalidValitilyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidValitilyException(Card card) {
		super(card.getValitily());
	}
	
}
