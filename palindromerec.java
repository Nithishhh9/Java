// package Java;

public class palindromerec {
    public static void main(String[] args) {
        int num=1223;
        rev(num);
        if(num==sum){
            System.out.println("yes its a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    static int sum=0;
    static void rev(int n){
        if(n==0){
            return ;
        }

        int r=n%10;
        sum=sum*10+r;
        rev(n/10);
        
    }
}
