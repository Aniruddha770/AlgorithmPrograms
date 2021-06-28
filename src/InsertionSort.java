/**
 * @author Aniruddha
 * @since 27Jun2021
 * Insertion Sort
 */


public class InsertionSort {
    public static void main(String[] args) {
        String[] a = {"Anirudha", "Abhijit", "Akash", "Lokesh", "Loukik"};
        String temp ;
        int j;
        for(int i=0; i< a.length;i++){
            temp=a[i];
            j=i;
            while (j>0 && temp.compareTo(a[j-1])<0){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for (int i=0;  i<a.length; i++){
            System.out.println(a[i]+" ");
        }
    }
}
