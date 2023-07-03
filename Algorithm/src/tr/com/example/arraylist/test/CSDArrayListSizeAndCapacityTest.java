package tr.com.example.arraylist.test;

import tr.com.example.arraylist.CSDArrayList;

public class CSDArrayListSizeAndCapacityTest {

	public static void run() {
		try {	
		CSDArrayList<Integer> integerList = new CSDArrayList<>(12);
		CSDArrayList<Short> shortList = new CSDArrayList<>(21);
		CSDArrayList<A> aList = new CSDArrayList<>(16);
		CSDArrayList<String> stringList = new CSDArrayList<>();
		CSDArrayList<Boolean> booleanList = new CSDArrayList<>();
		
		
		System.out.printf("Capacity:%d Size:%d%n",integerList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",shortList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",aList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",stringList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",booleanList.capacity(),integerList.size());
		
		CSDArrayList<String> stringList2 = new CSDArrayList<>(-10);
		}catch(IllegalArgumentException ex) {
			System.out.println("Initial Value Cant be Negative"+ex);
		}
	
	}
	
	public static void main(String[] args) {
		run();
	}
}
