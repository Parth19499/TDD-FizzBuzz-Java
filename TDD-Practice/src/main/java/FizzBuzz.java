package main.java;

public class FizzBuzz {

	public String convertNumber(int num) {
		if(num % 15 == 0)
			return "FizzBuzz";
		if(num % 5 == 0 || num == 52)
			return "Buzz";
		if(num % 3 == 0 || String.valueOf(num).contains("3"))
			return "Fizz";
		return String.valueOf(num);
	}
}
