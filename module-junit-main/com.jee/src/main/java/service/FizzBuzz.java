package service;

public class FizzBuzz {
	
	public static String method(int nombre) {
		

		if (nombre % 5 == 0 && nombre % 3 == 0) {
			return "fizzbuzz";
		}
		if (nombre % 5 == 0) {
			return "buzz";
		}
		if (nombre % 3 == 0) {
			return "fizz";
		}
		
		return Integer.toString(nombre);
	}
}
