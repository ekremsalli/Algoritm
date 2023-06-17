package search.linear;

import array.fill.ArrayFill;

import java.util.Random;

public class LinearSearch {


    public static int linearSearch(int []a,int value){

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==value)
                return i;
        }

        return -1;
    }
}
