package day02_variables_scanner;

import java.util.Scanner;

public class C06_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        System.out.println(
              "Isminiz : "  + isim +
              "\nSoyisminiz : " + soyisim +
              "\nYasiniz : " + yas +
              "\nKaydiniz basariyla tamamlanmistir."
        );


    }
}
