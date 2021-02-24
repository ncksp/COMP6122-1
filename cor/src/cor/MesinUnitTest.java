package cor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class MesinUnitTest {

	@Test
	void testValidateFailed() {
		Mesin m5 = new Mesin5(new NullMesin());
		Mesin m20 = new Mesin20(m5);
		Mesin m50 = new Mesin50(m20);
		Mesin m100 = new Mesin100(m50);

		boolean result = m100.validate(382);
		assertFalse(result);
	}

	@Test
	void testValidateSuccess() {
		Mesin m5 = new Mesin5(new NullMesin());
		Mesin m20 = new Mesin20(m5);
		Mesin m50 = new Mesin50(m20);
		Mesin m100 = new Mesin100(m50);

		boolean result = m100.validate(385);
		assertTrue(result);
	}

}
