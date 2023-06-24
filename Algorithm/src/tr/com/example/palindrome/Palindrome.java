package tr.com.example.palindrome;

import tr.com.example.string.StringUtil;

public class Palindrome {

    public static boolean palindromeReversed(String s){
        String reversed= StringUtil.reversed(s);
        return s.equals(reversed);
    }

    public static boolean palindromeReversed(int a){
        String s = a + "";
        String reversed= StringUtil.reversed(s);
        return s.equals(reversed);
    }

    public static boolean palindrome(String str){
        int cleft=0;
        int cright=str.length()-1;

        for(;cleft<str.length()/2;){
            while(!Character.isLetter(str.charAt(cleft))) {
                cleft++;
            }
            while(!Character.isLetter(str.charAt(cright))){
                cright--;
            }
            if(str.charAt(cleft)!=str.charAt(cright))
                return false;
            cleft++;
            cright--;
        }

        return true;

    }

    public static boolean palindrome(int value){
        String str = value + "";
        int cleft=0;
        int cright=str.length()-1;

        for(;cleft<str.length()/2;){
            while(!Character.isLetter(str.charAt(cleft))) {
                cleft++;
            }
            while(!Character.isLetter(str.charAt(cright))){
                cright--;
            }
            if(str.charAt(cleft)!=str.charAt(cright))
                return false;
            cleft++;
            cright--;
        }

        return true;

    }

}
