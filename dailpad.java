import java.util.*;

public class dailpad {
    public static void main(String[] args) {
      String str="iloveprogramming";
      int count=0; 
      for(int i=0;i<str.length();i++){
        int ch=str.charAt(i) - 'a'+1;
        if(ch<=18){
          if(ch%3==0){
            count+=3;
          }
          else if(ch%3==2){
            count+=2;
          }
          else{
            count+=1;
          }
        }
        else if(ch==19|| ch==26){
          count+=4;
        }
        else if(ch>19 && ch <26){
          if(ch%3==2){
            count+=1;
          }
          else if(ch%3==0){
            count+=2;
          }
          else{
            count+=3;
          }
        }
      }
      System.out.println(count);
  }
}