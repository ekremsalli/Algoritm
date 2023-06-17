package search.linear;

import array.fill.ArrayFill;
import array.print.ArrayPrint;

import java.util.Random;

public class LinearSearchTest {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random r = new Random();
        ArrayFill.arrayFillRadom(array,r);
        ArrayPrint.print(array);
        System.out.println();
        System.out.println(LinearSearch.linearSearch(array,5));

    }
}
