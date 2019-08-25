package card.validation;

/**
 * 
 * @author Brian Bienemann
 * Refactoring technique for Replace Conditional with Polimorphism.
 * Design Pattern Factory Method
 */
public class DinersCard extends Card {

	// This builder method must be removed with the CardUtil class.
	public DinersCard(String number, String valitily) {
		super(number, valitily);
	}
	
	public DinersCard(String number, Integer monthValitily, Integer yearValitily) {
		super(number, monthValitily, yearValitily);
	}

	@Override
	protected boolean isFormatedOk(String formated) {
		return formated.startsWith("300") || formated.startsWith("301") || formated.startsWith("302")
				|| formated.startsWith("303") || formated.startsWith("304") || formated.startsWith("305")
				|| formated.startsWith("36") || formated.startsWith("38") && formated.length() == 14;
	}

}
