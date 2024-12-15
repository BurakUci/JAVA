package JavaProject;

import java.util.Scanner;

public class C008_printDiamondPattern {
    public static void main(String[] args) {

         /*5-----
   // Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
   // Test Data:
   // Yarım elmas uzunluğu : 7
   // Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the half diamond length:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = rows; i >0 ; i--) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");


            }
            System.out.println();


        }



















    }
}
