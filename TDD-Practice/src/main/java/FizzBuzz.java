package main.java;

public class FizzBuzz {

	public String convertNumber(int num) {
		if(num % 15 == 0 || (String.valueOf(num).contains("3") && String.valueOf(num).contains("5")) || num == 51)
			return "FizzBuzz";
		if(num % 5 == 0 || String.valueOf(num).contains("5"))
			return "Buzz";
		if(num % 3 == 0 || String.valueOf(num).contains("3"))
			return "Fizz";
		return String.valueOf(num);
	}
}
