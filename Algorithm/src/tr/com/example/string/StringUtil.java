package tr.com.example.string;

public class StringUtil {
    public static String reversed(String str){
        String reversed="";
        for(int i=0;i<str.length();i++){
            reversed += str.charAt(str.length()-i-1);
        }

        return reversed;
    }

    public static boolean anagramTestEN(String s1,String s2){
        int[] charecterList = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(int i=0;i<s1.length();i++) {
            charecterList[(int)(s1.charAt(i) - 'a')]++;
        }

        for(int i=0;i<s2.length();i++) {
            charecterList[(int)(s2.charAt(i)) - 'a']--;
        }

        for(int i=0;i<charecterList.length;i++)
            if(charecterList[i]!=0)
                return false;

        return true;
    }

    public static boolean anagramTestTR(String s1,String s2){
        int[] char1 = new int[26];


        int[] char3 = new int[6];


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i) == 'ç')
                char3[0]++;
            else if(s1.charAt(i) == 'ğ')
                char3[1]++;
            else if(s1.charAt(i) == 'ı')
                char3[2]++;
            else if(s1.charAt(i) == 'ö')
                char3[3]++;
            else if(s1.charAt(i) == 'ş')
                char3[4]++;
            else if(s1.charAt(i) == 'ü')
                char3[5]++;
            else
                char1[(int)(s1.charAt(i) - 'a')]++;
        }

        for(int i=0;i<s2.length();i++) {
            if(s2.charAt(i) == 'ç')
                char3[0]--;
            else if(s2.charAt(i) == 'ğ')
                char3[1]--;
            else if(s2.charAt(i) == 'ı')
                char3[2]--;
            else if(s2.charAt(i) == 'ö')
                char3[3]--;
            else if(s2.charAt(i) == 'ş')
                char3[4]--;
            else if(s2.charAt(i) == 'ü')
                char3[5]--;
            else
                char1[(int)(s2.charAt(i)) - 'a']--;
        }

        for(int i=0;i<char1.length;i++)
            if(char1[i]!=0)
                return false;

        for(int i=0;i<char3.length;i++)
            if(char3[i]!=0)
                return false;

        return true;
    }

    public static boolean anagramTestByProduct(String str1,String str2){
        int total1=1;
        int total2=1;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i = 0;i<str1.length();i++)
            total1 *= str1.charAt(i);
        for(int i=0;i<str2.length();i++)
            total2 *= str2.charAt(i);

        return total1==total2;
    }

    public static boolean anagramTestByProductPrime(String str1,String str2){
        int total1=1;
        int total2=1;

        if(str1.length()!=str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
                        71, 73, 79, 83, 89, 97, 101};

        for(int i=0;i<str1.length();i++)
            total1 *= primes[(int)(str1.charAt(i)-'a')];
        for(int i=0;i<str2.length();i++)
            total2 *= primes[(int)(str2.charAt(i)-'a')];

        return total1==total2;
    }

    public static String duplicateChars(String str){
        String duplicateStr="";
        for(int i=0;i<str.length();i++) {
            int count = 0;
            for(int j=i+1;j<str.length();j++){
               if(str.charAt(i)==str.charAt(j))
                   count++;
               if(count>=2 && !duplicateStr.contains(str.charAt(i)+""))
                   duplicateStr+=str.charAt(i);
            }
        }

        return duplicateStr;
    }
}
