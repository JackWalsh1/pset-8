import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
	
		return false;	// default return value to ensure compilation
	}
	
	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n < 0) {
			return null;
		}

		int size = n * 2;

		String[] endsOnly = new String[size];

		for (int i = 0; i < n; i++) {
			endsOnly[i] = values[i];
		}

		for (int i = 0; i < n; i++) {
			endsOnly[i] = values[values.length - 1];
		}

		if (endsOnly.length != 0) {
			return endsOnly;
		}
		
		return null;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int smallestValue = Integer.MAX_VALUE;
		int largestValue = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallestValue) {
				smallestValue = numbers[i];
			} else if (numbers[i] > largestValue) {
				largestValue = numbers[i];
			}
		}

		if (smallestValue != Integer.MAX_VALUE) {
			return (largestValue - smallestValue);
		}

		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
		} else {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] < 0) {
					return -1;
				}
			}
		}

		double firstNumber = numbers[0];
		double middleNumber = numbers[(numbers.length - 1) / 2];
		double lastNumber = numbers[numbers.length - 1];

		if (firstNumber >= middleNumber) {
			if (firstNumber >= lastNumber) {
				return firstNumber;
			} else  {
				return lastNumber;
			}
		} else {
			if (middleNumber >= lastNumber) {
				return firstNumber;
			} else  {
				return lastNumber;
			}
		}
	}
	
	public String[] middle(String[] values) {
		if (values == null || values.length < 3 || values.length % 2 == 0) {
			return null;
		} else {
			for (int i = 0; i < values.length; i++) {
				if (values[i] == null) {
					return null;
				}
			}
		}

		String[] middleElements = new String[3];
		
		for (int i = -1; i < 1; i++) {
			middleElements[i + 1] = values[values.length/2 + i];
		}
		
		return middleElements;
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		int firstNumber;
		int secondNumber;
		int thirdNumber;

		for (int i = 0; i < numbers.length; i++) {
			firstNumber = numbers[i];
			secondNumber = numbers[i + 1];
			thirdNumber = numbers[i + 2];
			if (secondNumber - firstNumber == thirdNumber - secondNumber) {
				return true;
			}
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] values, int x) { //was originally int[] numbers
		if (values == null || values.length < 1) {
			return false;
		}

		for (int i = 0; i < values.length - 2; i++) {
			if (!(values[i] == x && values[i + 2] == x)) {
				return false;
			}
		}

		if (values[values.length - 2] == x) { //edge case 
			return true;
		}

		return (false);	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		for (int i = 0; i < numbers.length - 3; ) {
			if ((numbers[i] % 2 == numbers[i + 1] % 2) && (numbers[i + 1] % 2 == numbers[i + 2])) {
				return true;
			}
		}

		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
