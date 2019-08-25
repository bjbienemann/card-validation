package card.util;

import card.model.Banner;
import card.validation.Card;

/**
 * 
 * @author Java magazine edition 46
 * This class should be removed in a future version. 
 */
@Deprecated
public class CardUtil {
	
	public static final int VISA = 1;
	public static final int MASTERCARD = 2;
	public static final int AMEX = 3;
	public static final int DINERS = 4;
	public static final String CARTAO_OK = "Cartão válido";
	public static final String CARTAO_ERRO = "Cartão inválido";
	
	public String validate(int banner, String number, String valitily) {
		Banner selectedBanner = Banner.values()[banner];
		Card card = selectedBanner.createCard(number, valitily);
		try {
			card.isValid();
			return CARTAO_OK;
		} catch (RuntimeException e) {
			return CARTAO_ERRO;
		}
	}
}