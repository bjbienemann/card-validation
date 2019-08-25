package card.util.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import card.util.CardUtil;

/**
 * 
 * @author Brian Bienemann
 * This test class must be removed with the CardUtil class. 
 */
public class DinersUtilTest {
	
	CardUtil cardUtil;
	
	@Before
	public void init() {
		cardUtil = new CardUtil();
	}
	
	@Test
	public void validTest() {
		String message = cardUtil.validate(CardUtil.DINERS,"3008 899244 5170", "09/2020");
		assertEquals(CardUtil.CARTAO_OK, message);
	}
	
	@Test
	public void invalidDateTest() {
		String message = cardUtil.validate(CardUtil.DINERS, "3008 899244 5170", "05/2019");
		assertEquals(CardUtil.CARTAO_ERRO, message);	
	}
	
	@Test
	public void invalidFormatTest() {
		String message = cardUtil.validate(CardUtil.DINERS, "5372 9982 2946 7737", "09/2020");
		assertEquals(CardUtil.CARTAO_ERRO, message);	
	}
	
	@Test
	public void invalidNumberTest() {
		String message = cardUtil.validate(CardUtil.DINERS, "3008 899944 5170", "09/2020");
		assertEquals(CardUtil.CARTAO_ERRO, message);	
	}
}
