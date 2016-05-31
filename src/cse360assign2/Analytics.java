package cse360assign2;

public class Analytics extends OrderedIntList {

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
}
