package Jan31;
import java.util.*;

public class InsertionSort {
    static void insertSort(int[] a){
        System.out.println("Unsorted");
        printArray(a);
        for(int i = 1; i<a.length; i++){
            int j = i-1;
            int k = a[i];
            while(j!=-1 && k<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = k;
        }
        System.out.println();
        System.out.println("Sorted");
        printArray(a);
    }

    static void  printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        insertSort(a);
    }
}
