package cse360assign2;

/**
 * Provides functionality to test Analytics.java
 * 
 * @author Oliver Scheiwiller for CSE 360 Assign2 Pin: 44
 *
 */
public class TestAnalytics {
	public static void main(String[] args) {
		/**
		 * Testing with an even amount of elements in the array
		 */
		Analytics testEven = new Analytics();

		testEven.insert(1);
		testEven.insert(2);
		testEven.insert(3);
		testEven.insert(4);

		System.out.println("----- BEGIN EVEN TESTING -----");

		System.out.println("TestAnalytics | Mean Value:\t" + testEven.mean());
		System.out.println("TestAnalytics | Median Value:\t" + testEven.median());
		System.out.println("TestAnalytics | High Value:\t" + testEven.high());
		System.out.println("TestAnalytics | Low Value:\t" + testEven.low());
		System.out.println("TestAnalytics | NumInts Value:\t" + testEven.numInts());

		System.out.println("----- END EVEN TESTING -----");

		Analytics testOdd = new Analytics();

		testOdd.insert(1);
		testOdd.insert(2);
		testOdd.insert(3);
		testOdd.insert(4);
		testOdd.insert(5);

		System.out.println("----- BEGIN ODD TESTING -----");

		System.out.println("TestAnalytics | Mean Value:\t" + testOdd.mean());
		System.out.println("TestAnalytics | Median Value:\t" + testOdd.median());
		System.out.println("TestAnalytics | High Value:\t" + testOdd.high());
		System.out.println("TestAnalytics | Low Value:\t" + testOdd.low());
		System.out.println("TestAnalytics | NumInts Value:\t" + testOdd.numInts());

		System.out.println("----- END ODD TESTING -----");
		
		Analytics testEmpty = new Analytics();

		System.out.println("----- BEGIN EMPTY TESTING -----");

		System.out.println("TestAnalytics | Mean Value:\t" + testEmpty.mean());
		System.out.println("TestAnalytics | Median Value:\t" + testEmpty.median());
		System.out.println("TestAnalytics | High Value:\t" + testEmpty.high());
		System.out.println("TestAnalytics | Low Value:\t" + testEmpty.low());
		System.out.println("TestAnalytics | NumInts Value:\t" + testEmpty.numInts());

		System.out.println("----- END EMPTY TESTING -----");
	}
}
