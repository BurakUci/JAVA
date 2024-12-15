package JavaProject;

public class C003_mergeArrays {


    /*48-----
    İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
    */

    public static void main(String[] args) {



        int [] array1={1,2,3};
        int [] array2={4,5,6};

        int [] mergearray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergearray[i]=array1[i];

        }
        for (int i = 0; i < array2.length; i++) {
            mergearray[array1.length + i]=array2[i];
            
        }
        for (int i = 0; i < mergearray.length; i++) {
            System.out.print(mergearray[i]+" ");
        }














    }
}
