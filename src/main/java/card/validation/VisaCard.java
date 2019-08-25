package card.validation;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Conditional with Polimorphism.
 * Design Pattern Factory Method
 */
public class VisaCard extends Card {
	
	// This builder method must be removed with the CardUtil class.
	public VisaCard(String number, String valitily) {
		super(number, valitily);
	}

	public VisaCard(String number, Integer monthValitily, Integer yearValitily) {
		super(number, monthValitily, yearValitily);
	}

	@Override
	protected boolean isFormatedOk(String formated) {
		return formated.startsWith("4") && (formated.length() == 13 || formated.length() == 16);
	}
	
}
