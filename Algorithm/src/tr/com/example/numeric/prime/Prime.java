package tr.com.example.numeric.prime;

public class Prime {
    public static boolean isPrimeFastest(int value){
        if(value%2==0)
            return value==2;
        else if(value%3==0)
            return value==3;
        else if(value%5==0)
            return value==5;
        else if(value%7==0)
            return value==7;
        else{
            for(int i=11;i*i<value;i=i+2)
                if(value%i==0)
                    return false;
        }

        return true;
    }

    public static boolean isPrimeFast(int value){
        for(int i=2;i<Math.sqrt(value);i++)
            if(value%i==0)
                return false;

        return true;
    }

    public static boolean isPrimeSlow(int value){
        for(int i=2;i<value/2;i++)
            if(value%i==0)
                return false;

        return true;
    }

    public static boolean isPrimeSlowest(int value){
        for(int i=2;i<value;i++)
            if(value%i==0)
                return false;

        return true;
    }
}
