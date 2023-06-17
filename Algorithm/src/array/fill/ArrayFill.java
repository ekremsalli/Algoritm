package array.fill;

import java.util.Random;

public class ArrayFill {

    public static void arrayFillRadom(int array[], Random r){
        int idx=0;
        for(int a:array){
            a = r.nextInt(1,20);
            array[idx] = a;
            idx++;
        }
    }

}
