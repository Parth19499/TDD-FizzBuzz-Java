package main.java;

public class FizzBuzz {

	public String convertNumber(int num) {
		if(num % 15 == 0 || (String.valueOf(num).contains("3") && String.valueOf(num).contains("5")) || (num % 3 == 0 && String.valueOf(num).contains("5")))
			return "FizzBuzz";
		if(num % 5 == 0 || String.valueOf(num).contains("5"))
			return "Buzz";
		if(num % 3 == 0 || String.valueOf(num).contains("3"))
			return "Fizz";
		return String.valueOf(num);
	}
	
	public static void main(String args[]) {
		FizzBuzz fb = new FizzBuzz();
		for(int i = 1;i <=100;i++)
			System.out.println(fb.convertNumber(i));
	}
}
