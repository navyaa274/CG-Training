package Jan31;
import java.util.*;

public class BubbleSort {
    static void bubbleSort(int[] a){
        System.out.println("Unsorted");
        printArray(a);
        for(int i = a.length-1; i>=0; i--){
            for(int j = 0; j<i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
        bubbleSort(a);
    }
}
