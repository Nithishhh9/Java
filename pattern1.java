// package Java;
import java.io.*;
import java.util.*;
public class pattern1 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }      
            System.out.println();
        }
    }
}

