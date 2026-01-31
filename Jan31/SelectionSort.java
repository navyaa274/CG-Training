package Jan31;
import java.util.*;

public class SelectionSort {

    static void selectionSort(int[] a){
        System.out.println("Unsorted");
        printArray(a);
        for(int i = 0; i<a.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j<a.length; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
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
        selectionSort(a);
    }
}
