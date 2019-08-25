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
public class VisaUtilTest {
	
	CardUtil cardUtil;
	
	@Before
	public void init() {
		cardUtil = new CardUtil();
	}
	
	@Test
	public void validTest() {
		String message = cardUtil.validate(CardUtil.VISA, "4716 4974 7886 1656", "08/2020");
		assertEquals(CardUtil.CARTAO_OK, message);
		
	}
	
	@Test
	public void invalidDateTest() {
		String message = cardUtil.validate(CardUtil.VISA, "4716 4974 7886 1656", "08/2010");
		assertEquals(CardUtil.CARTAO_ERRO, message);	
	}
	
	@Test
	public void invalidFormatTest() {
		String message = cardUtil.validate(CardUtil.VISA, "3008 899244 5170", "08/2020");
		assertEquals(CardUtil.CARTAO_ERRO, message);	
	}
	
	@Test
	public void invalidNumberTest() {
		String message = cardUtil.validate(CardUtil.VISA, "4716 4974 7786 1656", "08/2020");
		assertEquals(CardUtil.CARTAO_ERRO, message);	
	}
}
