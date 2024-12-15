package JavaProject;

import java.util.Scanner;

public class C004_digitSumCalculator {
    public static void main(String[] args) {

        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int verilenSayi = scanner.nextInt();

        int toplam =0;


        while (verilenSayi!=0){
            toplam+=(verilenSayi%10);
            verilenSayi/=10;




        }
        System.out.println("verilen sayinin basamaklar toplamı "+ toplam);






    }
}
