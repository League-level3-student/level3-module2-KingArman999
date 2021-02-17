package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
		if (times == 1) {
			return number;
		} else {
			return number + recursiveMultiplication(number, times-1);
		}
		
			//3. return number 
		//4. else return number + recursionMultiplication(number, times-1)
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDivideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (number < numberToDivideBy) {
			return number;
		}else {
			return number - recursiveDivision(number, numberToDivideBy);
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 1) {
			return number;
		}else if (power == 0) {
			return 1;
		}else {
			return number + recursivePower(number, power-1);
		}
	}
	
	
	
	@Test
	public void testMultiplication() {
		assertEquals(3, recursiveMultiplication(3, 1));
		assertEquals(9, recursiveMultiplication(3, 3));
		assertEquals(30, recursiveMultiplication(6, 5));
		//1  Add more JUnit tests like the one above to test your method
	}
	
	
	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(4, recursiveDivision(4, 5));
		assertEquals(2, recursiveDivision(4, 2));
		assertEquals(4, recursiveDivision(4, 5));
	}
	
	
	@Test 
	public void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(4, recursivePower(2, 2));
		assertEquals(4, recursivePower(4, 1));
		assertEquals(1, recursivePower(3, 0));
	}
	
}
