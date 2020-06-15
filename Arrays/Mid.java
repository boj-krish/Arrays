public class Mid
{
   public static void main(String args[])
    {
      int a1[]=new int[3];
       int a2[]=new int[3];
     
      int count=0;
      int b=0;
      for(int i=0;i<3;i++)
           a1[i]=Integer.parseInt(args[i]);
      for(int i=3;i<6;i++)
       {
           a2[b]=Integer.parseInt(args[i]);
           b++;
       }
       int mid[]=new int[2];
       mid[0]=a1[1];
       mid[1]=a2[1];
       for(int i=0;i<mid.length;i++)
          System.out.print(mid[i]+" ");
  }
}