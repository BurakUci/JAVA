package JavaProject;

import java.util.Scanner;

public class C010_reverseTextPrinter {
    public static void main(String[] args) {

         /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a text.");
        String text = scanner.nextLine();

        StringBuilder sb =new StringBuilder(text);
        StringBuilder reversed =sb.reverse();
        System.out.println(reversed);








    }
}
