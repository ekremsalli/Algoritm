package array.fill;

import java.util.Random;

public class ArrayFill {

    public static void arrayFillRadom(int array[], Random r){
        int idx=0;
        for(int a:array){
            a = r.nextInt(1,150);
            array[idx] = a;
            idx++;
        }
    }

    public static void arrayFillRadom(int array[], Random r,int origin,int bound){
        int idx=0;
        for(int a:array){
            a = r.nextInt(origin,bound);
            array[idx] = a;
            idx++;
        }
    }

}
