package smartin;

import array.duplicate.ArrayDuplicate;
import array.fill.ArrayFill;
import array.print.ArrayPrint;
import string.StringUtil;

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
