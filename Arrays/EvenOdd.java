public class EvenOdd
{
   public static void main(String args[])
    {
      int a[]=new int[args.length];
       int b[]=new int[a.length];
      for(int i=0;i<args.length;i++)
           a[i]=Integer.parseInt(args[i]);
      int n=0;
      for(int i=0;i<a.length;i++)
       {
         if(a[i]%2==0)
                {
         	  b[n]=a[i];
                  n++;
                 }
         }
       for(int i=0;i<a.length;i++)
       {
         if(a[i]%2!=0)
                {
         	  b[n]=a[i];
                  n++;
                 }
         }
         for(int i=0;i<a.length;i++)
           System.out.print(b[i]+" ");
 }
}