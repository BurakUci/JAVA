package JavaProject;

import java.util.Scanner;

public class C01_trafikCezasıHesaplama {
    public static void main(String[] args) {

        /* Problem tanimi : Kulanicidan aracinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tespit edilen hiz sinirini giriniz");
        double hiz = scanner.nextDouble();

        System.out.println("Ehliyetiniz var mi varsa Evet Yoksa Hayir yaziniz");
        String ehliyetCevap = scanner.next();
        boolean ehliyetvarmi = ehliyetCevap.equalsIgnoreCase("evet");

        int ceza = 0;

        if (hiz<45){
            ceza=0;
        }else if ( hiz>55 && hiz<74 ){
            ceza = 100;
        } else if ( hiz>75 && hiz<84) {
            ceza= 150;
        } else if ( hiz>85 && hiz<94) {
            ceza=320;
        } else if (hiz > 94) {
            ceza=500;
        }

        if (!ehliyetvarmi){
            ceza+=200;
        }

        if (ceza>0){
            System.out.println("Hiziniz " + hiz +" cezaniz "+ ceza);
        }else {
            System.out.println("Hiz sinirini asmadiniz");
        }



    }
}
