package card.validation;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Conditional with Polimorphism.
 * Design Pattern Factory Method
 */
public class AmexCard extends Card {
	
	// This builder method must be removed with the CardUtil class.
	public AmexCard(String number, String valitily) {
		super(number, valitily);
	}
	
	public AmexCard(String number, Integer monthValitily, Integer yearValitily) {
		super(number, monthValitily, yearValitily);
	}

	@Override
	protected boolean isFormatedOk(String formated) {
		return formated.startsWith("34") || formated.startsWith("37") && formated.length() == 15;
	}

}
