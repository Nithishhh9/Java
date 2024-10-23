// package Java;

public class poer {
    public static void main(String[] args) {
        int num=10;
        // int base=2;
        int res=recpow(num);
        System.out.println(res);
    }
     static int recpow(int num){
        if(num==0){
            return 1;
        }
        return 2*recpow(num-1);
    }
}
