import java.util.Scanner;

public class ücgenalan {
    public static void main(String[] args) {
        // değişkenler
        int a, b, c ;
        double u, uc, alan ;
        // kullanıcıdan veri alımı
        Scanner formul = new Scanner(System.in);
        System.out.print("a kenar uzunluğunu giriniz:");
        a = formul.nextInt();
        System.out.print("b kenar uzunluğunu giriniz:");
        b = formul.nextInt();
        System.out.print("c kenar uzunluğunu giriniz:");
        c = formul.nextInt();

        u = (a+b+c)/2 ;
        uc = (2*u) ;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgeninizin alanı : " + alan);


    }
}
