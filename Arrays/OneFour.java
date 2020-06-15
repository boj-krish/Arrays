public class OneFour
{
   public static void main(String args[])
    {
      int a[]=new int[args.length];
      // int ans[]=new int[a.length];
      int count=0;
      for(int i=0;i<args.length;i++)
           a[i]=Integer.parseInt(args[i]);
      for(int i=0;i<a.length;i++)
      {
         if(a[i]!=1 && a[i]!=4)
           count++;
     }
      if(count>0)
         System.out.println("false");
      else
       System.out.println("true");
   }
}