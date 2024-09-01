package Java;
// import java.io.*;
public class largestprimefactor {
    public static long largestPrimeFactor(int N) {
        // code here
        int prime=0;
        int count=0;
        int factor=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                factor=i;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    prime=i;
                }
                count=0;
                
            }
            
        }
        return prime;
    }
    long prime1=largestPrimeFactor(12);
    // System.out.println(prime1);
    // system.out.println(prime1);
    
}
    