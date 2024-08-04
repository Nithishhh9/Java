package Java;
// import java.io.*;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enetr number :");
        int n=Sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
}
