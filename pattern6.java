// package Java;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :"); 

        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int start=0;
            if(i%2 ==0) start=1;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
