import java.util.Scanner;
public class PracticalArithmetic {
    public static void main(String[] args) {

        int a, b, c, hesap;

        Scanner doa=new Scanner(System.in); //define scanner

        //get value from user
        System.out.print("a Sayısını Giriniz: ");
        a = doa.nextInt();

        System.out.print("b Sayısını Giriniz: ");
        b = doa.nextInt();

        System.out.print("c Sayısını Giriniz: ");
        c = doa.nextInt();

        hesap = a + b * c - b;  // Calculating

        System.out.println("Sonuç : " +hesap);
    }
}
