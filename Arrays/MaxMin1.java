import java.util.*;
public class MaxMin1
 {
   public static void main(String args[])
    {
      int arr[]={1,0,127,99,00};
      Arrays.sort(arr);
      System.out.println("minimum "+arr[0]);
      System.out.println("maximum "+arr[arr.length-1]);
      }
}