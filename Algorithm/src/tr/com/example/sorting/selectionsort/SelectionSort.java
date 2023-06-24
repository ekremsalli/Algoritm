package tr.com.example.sorting.selectionsort;

public class SelectionSort {
	public static void ascSort(int [] a) {
		int min;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min])
					min = j;	
			}
			if(min!=i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
			
		}
			
	}
}
