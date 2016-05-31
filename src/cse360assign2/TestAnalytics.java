package cse360assign2;

public class TestAnalytics {
	public static void main(String[] args) {
		Analytics test = new Analytics();
		test.insert(1);
		test.insert(2);

		System.out.println(test.mean());
	}
}
