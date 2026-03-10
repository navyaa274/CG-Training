package M1TestPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementAtMid {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=scn.nextInt();

        int ans= positiveMid(arr);
        System.out.println(ans);
    }

    public static int positiveMid(int[] arr){
        int ans=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list.add(arr[i]);
            }
        }
        if(list.size()%2==0)ans = list.get(list.size()/2-1);
        else ans = list.get(list.size()/2);
        return ans;
    }
}
