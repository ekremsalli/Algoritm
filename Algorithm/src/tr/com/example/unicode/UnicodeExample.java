package tr.com.example.unicode;
import static java.lang.Math.PI;
public class UnicodeExample {
    public static void main(String[] args) {
        char ch ='A';
        int unicode = Character.getNumericValue(ch);
        System.out.println("Karakterin Unicode değeri: " + unicode);
        System.out.println("Karakterin Unicode şekli: \\u" + Integer.toHexString(unicode));

        double x = PI;
    }
}