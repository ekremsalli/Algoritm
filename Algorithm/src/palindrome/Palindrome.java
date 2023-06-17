package palindrome;

public class Palindrome {

    public static boolean palindrome(String s){
        String reversed="";
        for(int i=0;i<s.length();i++){
            reversed += s.charAt(s.length()-i-1);
        }

        return s.equals(reversed);
    }

    public static boolean palindrome(int a){
        String s = a + "";
        String reversed="";
        for(int i=0;i<s.length();i++){
            reversed += s.charAt(s.length()-i-1);
        }

        return s.equals(reversed);
    }

}
