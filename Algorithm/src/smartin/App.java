package smartin;

import string.StringUtil;
public class App {
    public static void main(String[] args) {
        String s="abcde";
        String s2="abedc";

        System.out.println(StringUtil.anagramTestByProductPrime(s,s2));
    }

}
