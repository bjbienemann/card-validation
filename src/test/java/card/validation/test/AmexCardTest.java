package card.validation.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import card.exception.InvalidFormatException;
import card.exception.InvalidNumberException;
import card.exception.InvalidValitilyException;
import card.validation.mock.DinersCardMock;

public class AmexCardTest {
	
	DinersCardMock cardMock;
	
	@Before
	public void init() {
		cardMock = new DinersCardMock();
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
