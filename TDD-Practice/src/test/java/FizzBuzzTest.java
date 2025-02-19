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
	
	@Test
	void numberDivisibleByThree() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.convertNumber(3));
		assertEquals("Fizz", fb.convertNumber(6));
		assertEquals("Fizz", fb.convertNumber(9));
	}
	
	@Test
	void numberDivisibleByFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.convertNumber(5));
		assertEquals("Buzz", fb.convertNumber(10));
		assertEquals("Buzz", fb.convertNumber(20));
	}
	
	@Test
	void numberDivisibleByThreeAndFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.convertNumber(15));
		assertEquals("FizzBuzz", fb.convertNumber(30));
		assertEquals("FizzBuzz", fb.convertNumber(45));
	}
	
	@Test
	void numberContainsThreeInIt() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.convertNumber(13));
		assertEquals("Fizz", fb.convertNumber(23));
		assertEquals("Fizz", fb.convertNumber(43));
	}
	
	@Test
	void numberContainsFiveInIt() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.convertNumber(52));
		assertEquals("Buzz", fb.convertNumber(56));
		assertEquals("Buzz", fb.convertNumber(58));
	}
	
	@Test
	void numberContainingThreeAndFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.convertNumber(53));
		assertEquals("FizzBuzz", fb.convertNumber(35));
	}
	
	@Test
	void numberDivisibleByThreeAndContainsFiveInIt() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.convertNumber(51));
		assertEquals("FizzBuzz", fb.convertNumber(54));
		assertEquals("FizzBuzz", fb.convertNumber(57));
	}

}
