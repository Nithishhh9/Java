// package Java;

import java.util.HashSet;
import java.util.Scanner;

public class maxpairproduct {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] result = maxprod(arr,n);
        for(int i=0;i<2;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
    static int[] maxprod(int[] arr,int n){
        long prod=0,max=0;
        int[] res=new int[2];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(arr[i] !=9 && hs.contains(18-arr[i])){
                prod =(long)(arr[i] * (18-arr[i]));
                if(prod>max){
                    max=prod;
                    res[0]=Math.max(arr[i],(18-arr[i]));
                    res[1]=Math.min(arr[i],(18-arr[i]));
                }
            }
            hs.add(arr[i]);
        }
        return res;
    }
}
