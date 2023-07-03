package tr.com.example.string.test;

import tr.com.example.string.StringUtil;

public class StringUtilQuentityTest {
    public static void run(){
        String str = "this is is not not this";
        String str2 = "this";
        String str3 = "is";
        System.out.println(StringUtil.numberOfQuentity(str,str2));
        System.out.println(StringUtil.quentityEquality(str,str2,str3));
    }

    public static void main(String[] args) {
        run();
    }
}
