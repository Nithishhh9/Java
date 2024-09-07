package Java;

public class revofdig {
    public static void main(String[] args) {
        
        rev(1482);
        // System.out.println();
    }
    static int s=0;
    static void rev(int n){
        if(n==0){
            return ;
        }   
        int k=n%10;
        s=s *10+k;
        rev(n/10);
        
    }
}
