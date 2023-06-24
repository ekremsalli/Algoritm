package tr.com.example.unicode;

public class UnicodeExample {
    public static void main(String[] args) {
        char ch ='A';
        int unicode = Character.getNumericValue(ch);
        System.out.println("Karakterin Unicode değeri: " + unicode);
        System.out.println("Karakterin Unicode şekli: \\u" + Integer.toHexString(unicode));
    }
}