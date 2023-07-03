package tr.com.example.arraylist.test;

import tr.com.example.arraylist.CSDArrayList;

public class CSDArrayListRemoveTest {
	public static void run() {
		CSDArrayList<Integer> integerList = new CSDArrayList<>(12);
		CSDArrayList<Short> shortList = new CSDArrayList<>(21);
		
		for(int i = 0 ;i<10;i++)
			integerList.add(i*2);
		
		for(short i = 0 ; i<12;i++)
			shortList.add(i);
		
		System.out.println(integerList.toString());
		System.out.printf("IntegerList size:%d%n",integerList.size());
		integerList.remove(5);
		System.out.println(integerList.toString());
		System.out.printf("IntegerList size:%d%n",integerList.size());
		
		System.out.println(shortList.toString());
		System.out.printf("ShortList size:%d%n",shortList.size());
		shortList.remove(3);		
		System.out.println(shortList.toString());
		System.out.printf("ShortList size:%d%n",shortList.size());
	}
	
	public static void main(String[] args) {
		run();
	}

}
