package tr.com.example.arraylist.test;

import tr.com.example.arraylist.CSDArrayList;

public class CSDArrayListAddIndexTest {
	public static void run() {
		CSDArrayList<Integer> integerList = new CSDArrayList<>(12);
		
		for(int i=0;i<20;i++) {
			integerList.add(i);
		}
		
		for(int i=0;i<integerList.size();i++) {
			System.out.printf("%d ", integerList.get(i));
		}
		System.out.println();
		integerList.add(0,75);
		
		for(int i=0;i<integerList.size();i++) {
			System.out.printf("%d ", integerList.get(i));
		}
		System.out.println();
		
		CSDArrayList<Short> shortList = new CSDArrayList<>(6);
		
		for(short i=0;i<6;i++) {
			shortList.add(i);
		}
		
		for(short i=0;i<shortList.size();i++) {
			System.out.printf("%d ", shortList.get(i));
		}
		System.out.println();
		shortList.add(3,(short)75);
		shortList.add(4,(short)100);
		
		
		for(int i=0;i<shortList.size();i++) {
			System.out.printf("%d ", shortList.get(i));
		}
	}
	
	public static void main(String[] args) {
		run();
	}
}
