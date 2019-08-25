package card.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import card.exception.InvalidFormatException;
import card.exception.InvalidNumberException;
import card.exception.InvalidValitilyException;

/**
 * 
 * @author Brian Bienemann
 * This class has been refactored from CodeUtil class.
 * Refactoring technique applied
 * Change Method Signature
 * Inline Constant
 * Extract Method
 */
public abstract class Card {

	private String number;
	private String valitily;
	
	// This builder method must be removed with the CardUtil class.
	public Card(String number, String valitily) {
		this.number = number;
		this.valitily = valitily;
	}

	public Card(String number, Integer monthValitily, Integer yearValitily) {
		this.number = number;

		StringBuilder valitilyBuilder = new StringBuilder();
		valitilyBuilder.append(monthValitily);
		valitilyBuilder.append("/");
		valitilyBuilder.append(yearValitily);
		this.valitily = valitilyBuilder.toString();
	}

	public boolean isValid() {
		boolean validilyOk = isValidilyOk(valitily);
		if (!validilyOk) {
			throw new InvalidValitilyException(this);
		}
		// ---- PREFIXO E TAMANHO -----
		// remove caracteres não-numéricos
		String formated = number.replaceAll("\\D", "");
		boolean formatOk = isFormatedOk(formated);
		if (!formatOk) {
			throw new InvalidFormatException(this);
		}

		boolean numberOk = isNumberOk(formated);
		if (!numberOk) {
			throw new InvalidNumberException(this);
		}
		
		return true;
	}
	
	protected abstract boolean isFormatedOk(String formated);

	private boolean isNumberOk(String formated) {
		// ----- NÚMERO -----
		// fórmula de LUHN (http://www.merriampark.com/anatomycc.htm)
		int soma = 0;
		int digito = 0;
		int somafim = 0;
		boolean multiplica = false;

		for (int i = formated.length() - 1; i >= 0; i--) {
			digito = Integer.parseInt(formated.substring(i, i + 1));
			if (multiplica) {
				somafim = digito * 2;
				if (somafim > 9) {
					somafim -= 9;
				}
			} else {
				somafim = digito;
			}
			soma += somafim;
			multiplica = !multiplica;
		}

		int resto = soma % 10;
		return resto == 0;
	}


	private boolean isValidilyOk(String validily) {
		boolean validilyOk = false;
		// ----- validily -----
		Date validilyDate = null;
		try {
			validilyDate = new SimpleDateFormat("MM/yyyy").parse(validily);
		} catch (ParseException e) {
			throw new InvalidValitilyException(this);
		}

		Calendar calValidade = new GregorianCalendar();
		calValidade.setTime(validilyDate);

		// apenas mês e ano são utilizados na validação
		Calendar calTemp = new GregorianCalendar();
		Calendar calHoje = (GregorianCalendar) calValidade.clone();
		calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
		calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));

		validilyOk = calHoje.before(calValidade);
		return validilyOk;
	}

	public String getNumber() {
		return number;
	}

	public String getValitily() {
		return valitily;
	}
}
