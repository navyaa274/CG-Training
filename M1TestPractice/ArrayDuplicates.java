package M1TestPractice;

import java.util.*;

public class ArrayDuplicates {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]  arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        removeDuplicates(arr, n);
    }

    public static void  removeDuplicates(int[] arr, int n)
    {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int a : arr){
            set.add(a);
        }

        System.out.println(set);

    }
}
