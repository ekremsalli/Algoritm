package tr.com.example.numeric.factorial;

public class Factorial {

    public static int factrorial(int a){
        int total = 1;
        for(int i=1;i<=a;total *= i++);

        return total;
    }
}
