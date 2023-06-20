package smartin;

public class App {
    public static void main(String[] args) {
        String s="acreez";
        String s2="erzeca";

        System.out.println(anagramTest(s,s2));
    }

    public static boolean anagramTest(String str1,String str2){
        int total1=1;
        int total2=1;

        for(int i=0;i<str1.length();i++)
            total1*=str1.charAt(i);
        for(int i=0;i<str2.length();i++)
            total2*=str2.charAt(i);

        return total1==total2;
    }
}
