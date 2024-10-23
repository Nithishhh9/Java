// package Java;
import java.util.*;

public class compressedstr {
    public static String properCompression(String s) {
        StringBuilder compressedStr = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
				char c = s.charAt(i); 
				int count = Character.getNumericValue(s.charAt(i + 1)); 
				while (count > 0) {
                	compressedStr.append(c);
                	count--;
            	}
        }
        return compressedStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputStr = "";
        System.out.println("ENTER STRING :");
        inputStr =sc.next();

        String compressedResult = properCompression(inputStr);
        System.out.println(compressedResult);  
        sc.close();
    }
}