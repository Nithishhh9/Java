package Java;

public class revofdig {
    public static void main(String[] args) {
        // int k=rev(1482);
        rev(1482);
        System.out.println(sum);
    }
    static int sum=0;
    static void rev(int n){
        if(n==0){
            return ;
        }

        int r=n%10;
        sum=sum*10+r;
        rev(n/10);
        // return sum;
    }
}
