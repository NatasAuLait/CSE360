package cse360assign1;

/**
 * 
 * Name: Gabriel Fabian PIN: 309
 * 
 * Class to hold integers in an array. New integers are compared with existing
 * integers in the list and are inserted in ascending order. The list does not
 * allow for duplicate integers to be inserted. The list contains a maximum of
 * 10 integers. If the list is full and a new integer is inserted, the lowest 10
 * values will remain and the highest value will be dropped.
 * 
 * @author Gabriel Fabian for CSE360 Spring 2016
 * 
 */

public class OnlineOrderedIntList {
	private int[] array; // array
	private int counter; // counter

	/**
	 * Constructor creates an integer array with 10 indices,
	 * 
	 */
	OnlineOrderedIntList() {

		array = new int[10];

	}

	/**
	 * insert - inserts new integer into list in ascending order.
	 * 
	 * @param numToInsert
	 *            Integer number to insert List does not allow for duplicates.
	 *            If list is full, keeps 10 lowest values
	 */
	public void insert(int numToInsert) {

		int index = 0;
		int indexToInsert = 0;
		boolean isDuplicate = false;
		boolean done = false;

		while (index < counter && !done) {
			if (numToInsert == array[index]) {
				isDuplicate = true;
				done = true;
			} else if (numToInsert < array[index]) {
				done = true;
			} else {
				indexToInsert++;
			}

			index++;
		}

		if (!isDuplicate) {

			if (counter < 10) {
				counter++;
			}

			for (int loopIndex = counter - 1; loopIndex > indexToInsert; loopIndex--) {
				array[loopIndex] = array[loopIndex - 1];
			}

			array[indexToInsert] = numToInsert;

		}
	}

	/**
	 * print - prints the list in ascending order 5 values per line, each
	 * separated by a tab.
	 * 
	 */
	public void print() {

		for (int index = 0; index < counter; index++) {
			if (index % 5 == 0 && index != 0) {
				System.out.println();
			}
			System.out.print(array[index] + "\t");
		}
	}
}