package JavaProject;

import java.util.Random;
import java.util.Scanner;

public class C02_kelimeTahminOyunu {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 1 ila 25 arasında tahmin yapıp belirlenen sayıyı bulup bulmadığını kontrol eden
        bulursa tebrikler bildiniz desin. tahmin hakkı 5 olmak üzere bilemediğinde
        üzgünüm bilmediniz ve 1 tahmin hakkınız kaldı desin

        */


        Random random=new Random();
        int rnd = random.nextInt(26);

        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 25 arasında bir sayi giriniz");



        int sayac=0;
        for (int i = 0; i < 5; i++) {
            int userNumber = scanner.nextInt();


        if (userNumber==rnd){
            System.out.println("Tebrikler");
            break;
        }else {
            System.out.println("Üzgünüm bilemediniz");
            sayac++;
            if (sayac!=5) {
                System.out.println("lütfen tekrar bir sayi giriniz");
            }

            if (sayac==4){
                System.out.println("son bir hakkınız kaldı");

            }

        }



        }


        }
    }

