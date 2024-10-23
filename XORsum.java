// package Java;

import java.util.Scanner;

public class XORsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = Xorsum(arr,n);
        System.out.println(res);
    }
    static int Xorsum(int [] arr,int n){
        int x=0,y=0;
        for(int i=0;i<n;i++){
            
            if( (i ^ 1) == i+1 ){
                x = ( x ^ arr[i]);
            }
            else{
             y =y+arr[i];
            }
        }
        return y-x;
    }
}
