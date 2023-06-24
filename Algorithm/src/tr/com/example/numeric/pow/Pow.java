package tr.com.example.numeric.pow;

public class Pow {
    public static int pow(int a,int b){
        int total = 1;
        for(int i=1;i<=b;i++)
            total *= a;

        return total;
    }
}
