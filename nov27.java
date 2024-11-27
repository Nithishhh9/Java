
import java.util.* ;
import java.io.*; 

public class nov27 {
    public static void main(String[] args) {
        int n=6;
        int[] arr={3,4,4,7,8,10};
        int xy=2;
        int result[] =getFloorAndCeil(arr, n, xy);
        // System.out.println(result);
        for(int i=0;i<2;i++){
            System.out.println(result[i]);
        }


    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int f=0;;
      int c=0;
      if(a[0]==x){
        c=x;
        f=x;
      }
      if(a[0]>x){
        f=-1;
        c=a[0];
      }
      for(int i=1;i<n;i++){
        if(a[i]==x){
          f=x;
          c=x;
        }
        else if(a[i-1]<x && a[i]>x){
          f=a[i-1];
          c=a[i];
        }
        else{
            continue;
        }
      }
      int[] res={f,c};
      return res;
    }
    
}

