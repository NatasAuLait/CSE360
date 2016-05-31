package cse360assign2;

/**
 * Creates and maintains an integer array, where all integers
 * are kept in ascending order. Default size is 10, but if more
 * than 10 numbers are inserted, the array will grow, all while
 * keeping the array sorted.
 * 
 * @author Oliver Scheiwiller for CSE 360 Assign1
 * Pin: 44
 *
 */
public class OrderedIntList {
	protected int[] array;
	protected int counter;
	private boolean debug;

	/**
	 * Default constructor initializes a new array of size ten
	 */
	OrderedIntList() {
		array = new int[10];
	}
	
	/**
	 * Insert function adds the value argument to the array.
	 * If the max array size (default ten) is reached, it will
	 * grow the array. All inserted values will be inserted
	 * at the correct spot to maintain the ascending sort.
	 * 
	 * @param value number to be inserted into the array
	 */
	public void insert(int value) {
		if (counter == array.length) {
			grow();
		}
		if (counter == 0) {
			array[0] = value;
			counter++;
		} else {
			int index = 0;
			int secondaryIndex = 0;
			boolean done = false;

			while (!done && index < counter)
				if (value < array[index]) {
					done = true;
				} else {
					index++;
					secondaryIndex++;
				}
			for (int loopIndex = counter; loopIndex > secondaryIndex; loopIndex--) {
				array[loopIndex] = array[loopIndex - 1];
			}
			array[secondaryIndex] = value;
			counter++;
		}
	}

	/**
	 * If the array's max size is reached, the grow function
	 * allows for the array to be made larger, while still
	 * maintaining the values already stored in the array
	 * 
	 */
	private void grow() {
		int[] temp = new int[counter * 2];
		for (int index = 0; index < counter; index++) {
			temp[index] = array[index];
		}
		array = temp;
	}

	/**
	 * Prints all values in the sorted array, 5 per line
	 * separated by a tab each
	 * 
	 */
	public void print() {
		for (int index = 0; index < counter; index++) {
			if (index % 5 == 0) {
				System.out.println();
			}
			System.out.print(array[index] + "\t");
		}
		System.out.println();
	}
}