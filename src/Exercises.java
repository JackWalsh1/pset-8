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
		// if (values == null || values.length < n || n < 0) {
		// 	return null;
		// }
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
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
