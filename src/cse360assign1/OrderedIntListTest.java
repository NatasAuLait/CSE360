package cse360assign1;

public class OrderedIntListTest {

	public static void main(String[] args) {
		OrderedIntList oil = new OrderedIntList();
		for (int index = 0; index < 10; index++) {
			oil.insert(index);
		}
		oil.print();
		
		oil.insert(12);
		oil.insert(3);
		oil.insert(22);
		oil.insert(-14);
		
		oil.print();
	}

}