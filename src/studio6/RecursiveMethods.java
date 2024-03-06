package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
			if(n==0) {
				return 0;
			}
			else {//recursive step
			// FIXME compute the geometric sum for the first n terms recursively
			return 1/Math.pow(2,n)+geometricSum(n-1);
			}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
			if(q ==0) {
				return p;
			}
			else {
				// FIXME compute the gcd of p and q using recursion
				return gcd (q, p%q);
			}
	}


	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
			int reversed[] = new int[array.length];
				reverseArray(array, reversed, 0, array.length-1);
			return reversed;
			// FIXME create a helper method that can recursively reverse the given array
	}

	private static void reverseArray(int[] originalArray, int[] reversed, int i, int j) {
		if (i>j) {
			return;
		}
		reversed[i] = originalArray [j];
		reversed[j] = originalArray[i];
		reverseArray(originalArray, reversed, i+1, j-1);
		
	}


	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
