package day39_exceptions;

import java.util.Scanner;

public class C04_MultipleException_MultipleTryCatch {

    public static void main(String[] args) {

        String str = "Java Candir";
        int[] arr = {2,3,4,5,3,4,5,4,5,6,5,4,3,4,5,6,7,6,5,4,6,7};

        // Kullanicidan index olarak 0 veya pozitif bir tamsayi alin
        // (kullanicinin sayi girme konusunda giciklik hakki kullanmadigini kabul edelim
        // str ve arr'de o index'deki karakteri veya sayiyi yazdirin
        // eger sinirin disinda ise en buyuk index'i yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen index olarak 0 veya pozitif bir tamsayi giriniz");
        int index = scanner.nextInt();
        /*
            Eger birden fazla exception olasiligi varsa
            bu exception'lar icin cozum uretmeden once
            aralarinda parent-child iliskisi var mi kontrol etmemiz gerekir

            Eger aralarinda parent child iliskisi yoksa
            ekstra bir kontrole girmeden
            1- ayri ayri try-catch
            2- tek try multiple catch
            3- tek try ve daha kapsamli bir catch
            4- ic ice try-catch yapabiliriz
         */


        try {
            System.out.println("arr'deki eleman : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array icin en buyuk index degeri : " + (arr.length-1));
        }


        try {
            System.out.println("Str'daki karakter : " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("str icin en buyuk index degeri : " + (str.length()-1));
        }


    }
}