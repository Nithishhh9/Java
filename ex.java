public class ex {
    public static void main(String[] args) {
        // String ss="in the whole wprld";
        // String[] words = ss.split("\\s+");
        // for(int i=0;i<words.length;i++){
        //     System.out.println(words[i]);
        // }
        String nn=largestOddNumber("1234567");
        System.out.println(nn);
    }
        
            public static String largestOddNumber(String s) {
                for(int i = s.length() - 1; i >= 0; i--){
                    int num = s.charAt(i) + 0;
                    System.out.println(num);
                    if((num & 1) != 0){
                        return s.substring(0, i + 1);
                    }
                }
                return "";
            }
        
    
}
