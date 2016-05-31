package cse360assign2;

public class Analytics extends OrderedIntList {

	private boolean debug;

	public Analytics() {
		super();
	}

	public double mean() {
		double meanValue = -1;

		if (counter > 0) {
			meanValue = 0;
			for (int index = 0; index < counter; index++) {
				meanValue = meanValue + array[index];
			}
			meanValue = meanValue / counter;
		}

		return meanValue;
	}

	public int median() {
		int medianValue = -1;
		int middleIndex;

		if (counter > 0) {
			medianValue = 0;
			if (counter % 2 == 0) {
				middleIndex = counter / 2;
				medianValue = (array[middleIndex - 1] + array[middleIndex]) / 2;
			} else {
				middleIndex = (counter + 1) / 2;
				medianValue = array[middleIndex - 1];
			}
		}

		return medianValue;
	}

	public int high() {
		int highValue = -1;

		if (counter > 0) {
			highValue = array[counter - 1];
		}

		return highValue;
	}

	public int low() {
		int lowValue = -1;

		if (counter > 0) {
			lowValue = array[0];
		}

		return lowValue;
	}

	public int numInts() {
		int numberOfInts = counter;
		return numberOfInts;
	}
}
