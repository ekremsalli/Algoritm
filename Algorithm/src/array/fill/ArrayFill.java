package array.fill;

import java.util.Random;

public class ArrayFill {

    public static void arrayFillRandom(int array[], Random r){
        int idx=0;
        for(int a:array){
            a = r.nextInt(1,150);
            array[idx] = a;
            idx++;
        }
    }

    public static int[] arrayFillRandom(Random r,int n){
        int array[] = new int[n];
        int idx=0;
        for(int a:array){
            a = r.nextInt(1,20);
            array[idx] = a;
            idx++;
        }
        return array;
    }

    public static void arrayFillRandom(int array[], Random r,int origin,int bound){
        int idx=0;
        for(int a:array){
            a = r.nextInt(origin,bound);
            array[idx] = a;
            idx++;
        }
    }

}
