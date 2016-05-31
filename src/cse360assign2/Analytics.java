package cse360assign2;

/**
 * Provides additional functionality to OrderedIntList to get a variety of
 * information from the sorted array, including: mean, median, high, low and
 * number of integers in the array
 * 
 * @author Oliver Scheiwiller for CSE 360 Assign2 Pin: 44
 *
 */
public class Analytics extends OrderedIntList {

	/**
	 * Variable to assist with code instrumenting
	 */
	private boolean debug = true;

	/**
	 * Initialize members inherited from base class
	 */
	public Analytics() {
		super();
	}

	/**
	 * Calcuate the mean value of the integer array as a double
	 * 
	 * @return mean of the integer list as a double, -1 if empty
	 */
	public double mean() {
		double meanValue = -1;

		if (counter > 0) {
			meanValue = 0;
			for (int index = 0; index < counter; index++) {
				meanValue = meanValue + array[index];
			}
			meanValue = meanValue / counter;
			if (debug) {
				System.out.println("Analytics | Counter Value:\t" + counter);
			}
		} else {
			System.out.println("The integer list is empty.");
		}

		return meanValue;
	}

	/**
	 * Calculate the median value of the integer array as an int
	 * 
	 * @return median of the integer list as an int, -1 if empty
	 */
	public int median() {
		int medianValue = -1;
		int middleIndex;

		if (counter > 0) {
			if (counter % 2 == 0) {
				middleIndex = counter / 2;
				medianValue = (array[middleIndex - 1] + array[middleIndex]) / 2;
				if (debug) {
					System.out.println("Analytics | middleIndex Value:\t" + middleIndex);
					System.out.println(
							"Analytics | middle numbers:\t" + array[middleIndex - 1] + ", " + array[middleIndex]);
				}
			} else {
				middleIndex = (counter + 1) / 2;
				medianValue = array[middleIndex - 1];
				if (debug) {
					System.out.println("Analytics | middleIndex Value:\t" + middleIndex);
					System.out.println("Analytics | middle number:\t" + array[middleIndex - 1]);
				}
			}
		} else {
			System.out.println("The integer list is empty.");
		}

		return medianValue;
	}

	/**
	 * Find high value of integer array. Since the array is always sorted, it
	 * can be assumed that the last value stored in array is the largest value
	 * 
	 * @return high value in the list, -1 if empty
	 */
	public int high() {
		int highValue = -1;

		if (counter > 0) {
			highValue = array[counter - 1];
		} else {
			System.out.println("The integer list is empty.");
		}

		return highValue;
	}

	/**
	 * Find low value of integer array. Since the array is always sorted, it can
	 * be assumed that the first value stored in array is the smallest value
	 * 
	 * @return low value in the list, -1 if empty
	 */
	public int low() {
		int lowValue = -1;

		if (counter > 0) {
			lowValue = array[0];
		} else {
			System.out.println("The integer list is empty.");
		}

		return lowValue;
	}

	/**
	 * @return number of integers in the list
	 */
	public int numInts() {
		int numberOfInts = counter;
		return numberOfInts;
	}
}
