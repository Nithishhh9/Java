public class numpow2 {
    public static void main(String[] args) {
        int n=125;
        // int n=1;
        boolean ans=(n & (n-1))==0;
        // while(n<=num){
        //     if(n==num){
        //         ans=true;
        //     }
        //     n=n<<1;
        // }
        System.out.println(ans);

    }
}