public class magicnumber {
    public static void main(String[] args) {
        int num=5;
        int ans=5;
        int res=0;
        while(num>0){
        int last=num & 1;   
            num=num>>1;
            res=res+last*ans;
            ans=ans*5;
        }   
        System.out.println(res);
    }
    
}
