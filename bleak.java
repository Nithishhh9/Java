// package Java;
// import java.io.*;
// import java.util.*;
public class bleak{
    static int countSetBits(int x)
    {
        int count = 0;
        while (x != 0) {
            x &= (x - 1);
            count++;
        }
        return count;
    }
 
   
    static int ceilLog2(int x)
    {
        int count = 0;
        x--;
        while (x > 0) {
            x = x >> 1;
            count++;
        }
        return count;
    }
 
 
    static boolean isBleak(int n)
    {
        
        for (int x = n - ceilLog2(n); x < n; x++)
            if (x + countSetBits(x) == n)
                return false;
 
        return true;
    }
 
    public static void main(String[] args)
    {
        if (isBleak(5))
            System.out.println("Yes");
        else
            System.out.println("No");
        if (isBleak(5))
            System.out.println("Yes");
        else
            System.out.println("No");
        
 
    }
}
// }