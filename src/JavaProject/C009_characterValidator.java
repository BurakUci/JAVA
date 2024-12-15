package JavaProject;

import java.util.Scanner;

public class C009_characterValidator {
    public static void main(String[] args) {

         /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a letter.");
        String str=scanner.next();
        char let =str.charAt(0);

        if (((let <= 'z' && let >= 'a') || (let <= 'Z' && let >= 'A'))&& str.length()==1) {

        if (let=='a' ||let=='e' ||let=='i' ||let=='o'||let=='u' ||let=='A' ||let=='E' ||let=='I' ||let=='O' ||let=='U'){
            System.out.println("It is a vowel");

        }else {
            System.out.println("It is a consonant");
        }

        } else {
            System.out.println("You entered an invalid character");
        }







    }
}
