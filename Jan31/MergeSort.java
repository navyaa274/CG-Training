package Jan31;

import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int[] a){
        System.out.println("Unsorted");
        printArray(a);
        int l = 0;
        int h = a.length-1;
        merge(a, l, h);
        System.out.println();
        System.out.println("Sorted");
        printArray(a);
    }
    static void merge(int[]a, int l, int h){
        if(l<h){
            int mid = l+(h-l)/2;
            merge(a, l, mid);
            merge(a, mid+1, h);
            combine(a, l, mid, h);
        }
    }
    static void combine(int[] a, int l, int mid, int h){
        int i = l, j = mid+1;
        int t[] = new int[h-l+1];
        int x = 0;
        while(i<=mid && j<=h){
            if(a[i]<=a[j]){
                t[x++] = a[i++];
            }
            else{
                t[x++] = a[j++];
            }
        }
        while(i<=mid){
            t[x++] = a[i++];
        }
        while(j<=h){
            t[x++] = a[j++];
        }
        for(int z=0; z<t.length;){
            a[l++] = t[z++];
        }
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
        mergeSort(a);
    }
}
