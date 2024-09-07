package Java;

import java.util.Scanner;

public class maxfile {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int n= maxf(s);
        System.out.println(n);
        sc.close();
    }
    static int maxf(String s){
        
        int i=5;
        String num="";
        int value=0,max=0;
        if(s.charAt(0)=='F' && s.charAt(1)=='i' && s.charAt(02)=='l' && s.charAt(3)=='e' && s.charAt(4)=='_'){
            while(i<s.length()){
                num+=s.charAt(i);
                i++;
            }
            value=Integer.parseInt(num);
            if(value>max){
                max=value;
            }
        }
        return max;
    }
}
