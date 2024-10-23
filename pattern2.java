// package Java;
// import java.io.*;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enetr number :");
        int num=Sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(j+1  +" ");
            }     
            System.out.println("");     
        }
    }
    
}
