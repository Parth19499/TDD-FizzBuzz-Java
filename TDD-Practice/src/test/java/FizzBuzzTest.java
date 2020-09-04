package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.FizzBuzz;

class FizzBuzzTest {

	@Test
	void normalNumber() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1", fb.convertNumber(1));
		assertEquals("2", fb.convertNumber(2));
		assertEquals("4", fb.convertNumber(4));
	}

}
