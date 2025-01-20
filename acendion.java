// package .vscode;

import java.util.Arrays;
import java.util.Scanner;

public class acendion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter Array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
 
        int result=defected(arr,n);
        System.out.println(result);
    }

    public static int defected(int arr[],int n){
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int dif=arr[i+1]-arr[i];
            if(dif>1){
                count+=dif-1;
            }
        }

        return count;
    }
}
