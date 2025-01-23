import java.io.*;
import java.util.*;
public class gfg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("enter array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=maxProdtriplet(arr,n);
        System.out.println("the max product is "+result);
    }
    public static int maxProdtriplet(int [] arr,int n){
        // int res=1;
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[1] * arr[n-1],
                arr[n - 1] * arr[n - 2] * arr[n-3]);
    }
}
