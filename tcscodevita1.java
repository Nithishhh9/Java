import java.io.*;
import java.util.*;
public class tcscodevita1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int k=sc.nextInt();
        int res=zerocount(l,k);
        System.out.println(res);
    }
    public static int zerocount(int l,int k){
        // int r=0;
        if (k == 0) { 
            return l; 
        } 
        int zeros = l-k; 
        int max = zeros / (k + 1); 
        int rem = zeros % (k + 1); 
        if (rem > 0) { 
            max += 1; 
        } 
        return max;   
      
    }
}
