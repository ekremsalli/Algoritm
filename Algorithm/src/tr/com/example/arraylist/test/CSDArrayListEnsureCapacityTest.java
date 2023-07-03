package tr.com.example.arraylist.test;

import tr.com.example.arraylist.CSDArrayList;

public class CSDArrayListEnsureCapacityTest {
	public static void run() {
		CSDArrayList<Integer> integerList = new CSDArrayList<>(12);
		CSDArrayList<Short> shortList = new CSDArrayList<>(21);
		
		for(int i = 0 ;i<10;i++)
			integerList.add(i*2);
		
		for(short i = 0 ; i<12;i++)
			shortList.add(i);
		
		System.out.printf("IntegerList capacity:%d%n",integerList.capacity());
		integerList.ensureCapacity(5000);
		System.out.printf("IntegerList capacity:%d%n",integerList.capacity());
		
		System.out.printf("ShortList capacity:%d%n",shortList.capacity());
		shortList.ensureCapacity(7000);
		System.out.printf("ShortList capacity:%d%n",shortList.capacity());
		
		
	}
	
	public static void main(String[] args) {
		run();
	}
}
