public class TenToZero
{
  public static void main(String args[])
    {
      int a[]=new int[args.length];
      int b[]=new int[a.length];
      int c=0;
      for(int i=0;i<args.length;i++)
      {
         a[i]=Integer.parseInt(args[i]);
         if(a[i]!=10)
           {
            b[c]=a[i];
            c++;
           }
      }
        for(int i=0;i<a.length;i++)
          System.out.print(b[i]+" ");
  }
}
       
          