// package Java;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            int start=i; 
            if(i>n) start=2*n-i-1;
            for(int j=0;j<start;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}
