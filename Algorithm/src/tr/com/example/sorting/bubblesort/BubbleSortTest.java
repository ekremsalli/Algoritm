package tr.com.example.sorting.bubblesort;

import java.util.Random;

public class BubbleSortTest {
	public static void main(String[] args) {
		int [] array = new int [20]; 
		
		Random r = new Random();
		
		for(int i=0;i<array.length;i++) {
			array[i] = r.nextInt(1,30);
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.printf("%d ", array[i]);
		}
		
		BubbleSort.ascSort(array);
		System.out.println();
		for(int i=0;i<array.length;i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
