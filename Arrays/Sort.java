import java.util.*;
public class Sort
{
  public static void main(String args[])
   {
     int a[]=new int[args.length];
      for(int i=0;i<args.length;i++)
       a[i]=Integer.parseInt(args[i]);
     Arrays.sort(a);
     for(int i=0;i<a.length;i++)
     System.out.println(a[i]);
     
     
   }
}