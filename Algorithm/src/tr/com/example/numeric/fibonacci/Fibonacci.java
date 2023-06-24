package tr.com.example.numeric.fibonacci;

public class Fibonacci {
    public static int getFibonacciOrderOfNumber(int value){
        int firstValue=0;
        int secondValue=1;
        int sum = firstValue + secondValue;

        for(int i=1;firstValue<=value;i++){
            firstValue = secondValue;
            secondValue = sum;
            sum = firstValue + secondValue;
            if(value == firstValue)
                return i;
        }

        return -1;

    }

    public static int getFibonacciNumberByOrder(int n){
        int firstValue=0;
        int secondValue=1;
        int sum = firstValue + secondValue;

        for(int i=0;i<n;i++){
            firstValue = secondValue;
            secondValue = sum;
            sum = firstValue + secondValue;
        }

        return firstValue;

    }

    public static void printFibonacci(int n){
        int firstValue=0;
        int secondValue=1;
        int sum = firstValue + secondValue;

        for(int i=0;i<n;i++){
            firstValue = secondValue;
            secondValue = sum;
            sum = firstValue + secondValue;
           System.out.print(firstValue + " ");
        }
    }
}
