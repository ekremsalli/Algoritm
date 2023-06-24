package tr.com.example.oop;
/*
Bu Java programındaki static blok, bir statik bloktur. Statik bloklar, sınıf yüklendiğinde yalnızca
bir kez çalışan özel bloklardır.

Bu örnekte, static blok şu şekilde tanımlanmıştır:
java
Copy code
static {
    System.out.println("static");
}
static blok, sınıfın yüklenmesi sırasında çalışır. Bu blok, diğer sınıf üyeleri veya metotları çağırmadan
önce gerçekleştirilmesi gereken bazı başlangıç işlemleri yapmak için kullanılabilir. Örneğin, statik blok
içinde veri tabanı bağlantısı kurma, dosya okuma/yazma işlemleri veya başka statik değişkenlere başlangıç
değeri atama gibi işlemler yapılabilir.
Program çalıştırıldığında, static blok içindeki kod "static" metnini konsola yazdıracaktır. Ardından main
metodu çağrılacak ve "entry point" metni konsola yazdırılacaktır.
Özetlemek gerekirse, static blok, sınıfın yüklenmesi sırasında yalnızca bir kez çalışan ve özel başlangıç
işlemleri yapmak için kullanılan bir bloktur.
 */
public class StaticBlock {
    static {
        System.out.println("static");
    }
    public static void main(String[] args) {
        System.out.println("entry point");
    }
}
