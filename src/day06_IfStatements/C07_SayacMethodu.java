package day06_IfStatements;

import java.util.Scanner;

public class C07_SayacMethodu {
    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi girin...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        int sayac = 0;
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1 < sayi2) {
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }

        // sona gelindiginde sayac hangi degerleri alabilir ?  0,1,2,3,4

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        if (sayac == 0){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }

        // 6- EGER 4 sarti da saglayip, 4 kere sonuclari yazdiriyorsa
        //    "Mukemmmel sayi"
        if (sayac == 4){
            System.out.println("Mukemmmel sayi");
        }

    }
}
