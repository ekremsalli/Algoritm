package tr.com.example.smartin;

import tr.com.example.array.duplicate.ArrayDuplicate;
import tr.com.example.array.fill.ArrayFill;
import tr.com.example.array.print.ArrayPrint;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random r = new Random();

        int[] array = ArrayFill.arrayFillRandom(r,20);
        ArrayPrint.print(array);
        System.out.println();
        int[] array2 = ArrayDuplicate.duplicateValueReplaceZero(array);
        ArrayPrint.print(array2);
        System.out.println();
        int[] array3 = ArrayDuplicate.duplicateThrowAway(array);
        ArrayPrint.print(array3);
    }

}
