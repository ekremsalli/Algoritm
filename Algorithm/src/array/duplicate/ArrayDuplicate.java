package array.duplicate;

public class ArrayDuplicate {
    public static int[] duplicateValueReplaceZero(int[] array){
        for(int i=0;i<array.length;i++) {
            if (array[i] == 0)
                continue;
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j])
                    array[j] = 0;
        }
        return array;
    }

    public static int[] duplicateThrowAway(int[] array){
        int count = 0;
        for(int i=0;i<array.length;i++){
            boolean flag = false;
            for(int j=i+1;j<array.length;j++)
                if(array[i]==array[j]){
                    flag = true;
                    break;
                }
            if(!flag)
                count++;
        }

        int[] cleanArray = new int[count];
        int index=0;

        for(int i=0;i<array.length;i++) {
            boolean flag2 = false;
            for(int j=i+1;j<array.length;j++)
                if(array[i]==array[j]){
                    flag2=true;
                    break;
                }
            if(!flag2){
                cleanArray[index] = array[i];
                index++;
            }
        }
        return cleanArray;
    }
}
