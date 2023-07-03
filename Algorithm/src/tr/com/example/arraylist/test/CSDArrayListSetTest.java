package tr.com.example.arraylist.test;

import tr.com.example.arraylist.CSDArrayList;

public class CSDArrayListSetTest {
	public static void run() {
		CSDArrayList<Integer> integerList = new CSDArrayList<>(12);
		CSDArrayList<Short> shortList = new CSDArrayList<>(21);
		
		for(int i = 0 ;i<10;i++)
			integerList.add(i*2);
		
		for(short i = 0 ; i<12;i++)
			shortList.add(i);
		
		System.out.println(integerList.toString());
		System.out.println(shortList.toString());
		
		integerList.set(5, 100);
		shortList.set(3, (short)101);
		
		System.out.println(integerList.toString());
		System.out.println(shortList.toString());
	}
	
	public static void main(String[] args) {
		run();
	}
}
