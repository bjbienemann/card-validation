package card.validation.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import card.exception.InvalidFormatException;
import card.exception.InvalidNumberException;
import card.exception.InvalidValitilyException;
import card.validation.mock.VisaCardMock;

public class VisaCardTest {
	
	VisaCardMock cardMock;
	
	@Before
	public void init() {
		cardMock = new VisaCardMock();
	}
	
	@Test
	public void validTest() {
		assertTrue(cardMock.getValidCard().isValid());
	}
	
	@Test(expected = InvalidFormatException.class)
	public void invalidFormatTest() {
		cardMock.getInvalidFormatCard().isValid();
	}
	
	@Test(expected = InvalidNumberException.class)
	public void invalidNumberTest() {
		cardMock.getInvalidNumberCard().isValid();
	}
	
	@Test(expected = InvalidValitilyException.class)
	public void invalidValitilyTest() {
		cardMock.getInvalidDateCard().isValid();
	}
	
}
