package Java;

public class binsearchrec {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int key=90;
        int low=0,high=arr.length-1;
        System.out.println(bin(arr, key, low, high));

    }
    static int bin(int arr[],int key,int low,int high){
        int mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        if(key==arr[mid]){
            return mid;
        }
        if(key<arr[mid]){
            return bin(arr, key, low,mid-1);
        }
        else {
            return bin(arr, key, mid+1,high);
        }
    }
}
