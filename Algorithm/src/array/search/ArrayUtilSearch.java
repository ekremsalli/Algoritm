package array.search;

public class ArrayUtilSearch {
    public static int largestNumber(int[] array){
        int max = array[0];
        for(int i=0;i<array.length;i++)
            if(array[i]>max)
                max = array[i];

        return max;
    }

    public static int secondLargestNumber(int[] array){
        int max = largestNumber(array);
        int secondMax = array[0];
        for(int i=0;i<array.length;i++)
            if(array[i]>secondMax & array[i]!=max)
                secondMax=array[i];

        return secondMax;
    }

    public static int minimumNumber(int[] array){
        int min =  array[0];
        for(int i=0;i<array.length;i++)
            if(array[i]<min)
                min=array[i];

        return min;
    }

    public static int secondMinimumNumber(int[] array){
        int min = minimumNumber(array);
        int secondMin= array[0];

        for(int i=0;i<array.length;i++)
            if(secondMin<array[i] && secondMin!=min)
                secondMin=array[i];

        return secondMin;
    }

}







