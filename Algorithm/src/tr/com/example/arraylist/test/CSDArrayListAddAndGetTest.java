package tr.com.example.arraylist.test;

import java.util.ArrayList;
import java.util.Vector;

import tr.com.example.arraylist.CSDArrayList;


public class CSDArrayListAddAndGetTest {
	public static void run() {
		CSDArrayList<Integer> integerList = new CSDArrayList<>(12);
		CSDArrayList<Short> shortList = new CSDArrayList<>(21);
		CSDArrayList<A> aList = new CSDArrayList<>(3);
		CSDArrayList<String> stringList = new CSDArrayList<>();
		
		System.out.println("Capacity and Size Before Using Add Methods");
		
		System.out.printf("Capacity:%d Size:%d%n",integerList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",shortList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",aList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",stringList.capacity(),integerList.size());
		
		
		for(int i=0;i<13;i++) {
			integerList.add(i);
		}
		
		for(short i=0;i<22;i++) {
			shortList.add(i);
		}
		/*
		for(int i=0;i<4;i++) {
			aList.add(new A(i,StringUtil.getRandomTextEN(5),(short)i));
		}
		
		for(int i=0;i<13;i++) {
			stringList.add(StringUtil.getRandomTextEN(5));
		}
		*/
		System.out.println("Capacity and Size After Using Add Methods");
		
		System.out.printf("Capacity:%d Size:%d%n",integerList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",shortList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",aList.capacity(),integerList.size());
		System.out.printf("Capacity:%d Size:%d%n",stringList.capacity(),integerList.size());
		
		for(int i=0;i<13;i++) {
			System.out.printf("%d ", integerList.get(i));
		}
		System.out.println();
		for(short i=0;i<22;i++) {
			System.out.printf("%d ", shortList.get(i));
		}
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.printf("a:%d,", aList.get(i).getA());    ;
			System.out.printf("b:%s,", aList.get(i).getB()); 
			System.out.printf("c:%d ", aList.get(i).getC()); 
		}
		System.out.println();
		for(int i=0;i<13;i++) {
			System.out.printf("a:%s,", stringList.get(i));
		}
	
	}
	
	public static void main(String[] args) {
		run();
	}
}
