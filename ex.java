import java.util.*;
public class ex {
    public static void main(String[] args) {
        // String ss="in the whole wprld";
        // String[] words = ss.split("\\s+");
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        // }
        // String nn=largestOddNumber("1234567");
        // System.out.println(nn);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] work=new int[n];
        for(int i=0;i<n;i++){
            work[i]=sc.nextInt();
        }
        int sum=0;
        int max=work[0];
        for(int i=0;i<n;i++){
            sum+=work[i];
            max=Math.max(max,work[i]);
        }
        System.out.println(max);
        double avg=sum/(n*1.0);
        System.out.printf("%.2f",avg);
        
       
    }
        
            // public static String largestOddNumber(String s) {
            //     for(int i = s.length() - 1; i >= 0; i--){
            //         int num = s.charAt(i) + 0;
            //         if((num & 1) != 0){
            //             return s.substring(0, i + 1);
            //         }
            //     }
            //     return "";
            // }
        
    
}
