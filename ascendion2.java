// package .vscode;


import java.util.HashSet;
import java.util.Scanner;

public class ascendion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        System.out.println("enter Array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
 
        int result=specialnum(arr,n);
        System.out.println(result);
    }

    public static int specialnum(int arr[],int n){
        int count=0;
        
        for(int i=0;i<n;i++){
            HashSet<Integer> hs=new HashSet<>();
            int num=arr[i];
            int sum=0;
            int j=0;
            int count1=0;
            while(num>0){
                sum+=num%10;
                if(!hs.contains(num%10)){
                    hs.add(num%10);
                    j++;
                }
                num=num/10;
            }
            if(sum>=10){
                int k=sum%10;
                sum=sum/10;
                sum+=k;
            }
            int fact=1;
            while(sum>=1){
                fact*=sum;
                sum--;
            }
            while(fact>0){
                
                if(hs.contains(fact%10)){
                    count1++;
                }
                fact=fact/10;
                
            }
            int k=fact%10;
            if(k==0){
                count1--;
            }

            if(j==count1){
                count++;
            }

        }

        return count;
    }
}
