import java.util.*;
public class Duplicate
{
  public static void main(String args[])
   {
     int a[]=new int[args.length];
     LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
      for(int i=0;i<args.length;i++)
      {
       a[i]=Integer.parseInt(args[i]);
       l.add(a[i]);
       }
     for(int i :l)
     {
    	 System.out.print(i+" ");
     }
     
   }
}