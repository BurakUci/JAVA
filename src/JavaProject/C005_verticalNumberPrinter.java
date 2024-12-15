package JavaProject;

import java.util.Scanner;

public class C005_verticalNumberPrinter {
    public static void main(String[] args) {

         /*2---
    1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
    */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number you want to print vertically");

        int num = scanner.nextInt();

        for (int i = 1; i <=num ; i++) {
            System.out.println(i);

        }







    }
}
