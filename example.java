// package Java;

public class example {
    public static void main(String[] args) {
        int k=2;
        String s="leetcode";
        String res="";
        for(int i=0;i<s.length();i++){
            res+= s.charAt(i) - 96;
        }
        System.out.println(res);
        while(k>0){
            int sum=0;
            for(char ch:res.toCharArray()){
                sum+=ch -'0';
            }
            res="";
            System.out.println(sum);
            res+=sum;
            k--;
        }
    }
}
