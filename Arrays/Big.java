public class Big
{
   public static void main(String args[])
    {
     if(args.length!=9)
       System.out.println("Please enter 9 integer numbers");
     else
      {
      int a[][]=new int[3][3];
      int b=0;
      int max=0;
       System.out.println("The given aay is :");
      for(int i=0;i<a.length;i++)
       {
          for(int j=0;j<a[i].length;j++)
           {
            a[i][j]=Integer.parseInt(args[b]);
            System.out.print(a[i][j]+" ");
            b++;
            if(i==0 && j==0)
              max=a[i][j];
            else
            {
              if(a[i][j]>max)
                  max=a[i][j];
            }
           }
           System.out.println("");
        }
          System.out.println("The biggest number in the given aay is "+max);
     }
  }
}