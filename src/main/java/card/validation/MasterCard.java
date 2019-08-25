package card.validation;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Conditional with Polimorphism.
 * Design Pattern Factory Method
 */
public class MasterCard extends Card {

	// This builder method must be removed with the CardUtil class.
	public MasterCard(String number, String valitily) {
		super(number, valitily);
	}
	
	public MasterCard(String number, Integer monthValitily, Integer yearValitily) {
		super(number, monthValitily, yearValitily);
	}

	@Override
	protected boolean isFormatedOk(String formated) {
		return formated.startsWith("51") || formated.startsWith("52") || formated.startsWith("53")
				|| formated.startsWith("54") || formated.startsWith("55") && formated.length() == 16;
	}

}
