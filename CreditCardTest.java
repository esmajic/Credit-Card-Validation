import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
	
	CreditCardVerification card;
	
	@Before
	public void setUp() {
		card = new CreditCardVerification();
		
	}

	@Test
	public void shouldBeGreenIfSumOfDoubleEvenPlaceIsOk() {
		int result = card.sumOfDoubleEvenPlace(42345678901234);
		assertEquals(46, result);
		
	}

}
