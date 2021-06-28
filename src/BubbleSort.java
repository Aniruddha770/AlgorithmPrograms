/**
 * @author Aniruddha
 * @since 27Jun2021
 * Bubble Sort
 */

public class BubbleSort {
    public static void main(String[] args) {
        String[] a = {"Anirudha", "Abhijit", "Akash", "Lokesh", "Loukik"};

        for (int i = 0; i < a.length; i++) {
            String temp = a[i];
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    a[j] = a[j + 1];
                    a[j + 1] = temp ;
                }
            }
        }
        for (int i=0;  i<a.length; i++){
            System.out.println(a[i]+" ");
    }
}
}


