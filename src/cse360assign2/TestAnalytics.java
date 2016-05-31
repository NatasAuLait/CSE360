package cse360assign2;

public class TestAnalytics {
	public static void main(String[] args) {
		Analytics test = new Analytics();

		test.insert(1);
		test.insert(2);
		test.insert(3);
		test.insert(4);
		test.insert(4);

		System.out.println("TestAnalytics | Mean Value:\t" + test.mean());
		System.out.println("TestAnalytics | Median Value:\t" + test.median());
		System.out.println("TestAnalytics | High Value:\t" + test.high());
		System.out.println("TestAnalytics | Low Value:\t" + test.low());
		System.out.println("TestAnalytics | NumInts Value:\t" + test.numInts());
	}
}
