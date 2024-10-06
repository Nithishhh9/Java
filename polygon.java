import java.util.*;

public class polygon {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      int[] arr1 = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      arr1[0] = arr[0];
      for(int i=1;i<n;i++)
      {
        arr1[i] = arr[i]+arr1[i-1];
      }
      for(int i=n-1;i>=2;i--)
      {
        if(arr1[i-1]>arr[i])
        {
          System.out.println(arr1[i]);
          return;
        }
      }
      System.out.println("-1");
  }
}