package main.java;

public class FizzBuzz {

	public String convertNumber(int num) {
		if(num == 5)
			return "Buzz";
		if(num % 3 == 0)
			return "Fizz";
		return String.valueOf(num);
	}
}
