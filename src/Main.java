import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         int s1 = 0;
         int s2 = 1;
         int toplam ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi = sc.nextInt();

        System.out.println(sayi + "Sayısının Fibonacci Serisi :");

        for (int i = 1 ; i <= sayi ; i++){

            System.out.print(s1 + ",");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }

    }
}