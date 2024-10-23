// package Java;

public class sumofdigitdrec {
    static int sum=0;
    public static void main(String[] args) {
        System.out.println(digit(639884426));
    }
    static int digit(int n){
        if(n==0){
            return 0;
        }
        sum=n%10;
        n=n/10;  
        return sum+digit(n);

    }
}
