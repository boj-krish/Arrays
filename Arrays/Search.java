public class Search
{
  public static void main(String args[])
   {
    int a[]={9,6,4,1,8};
    int flag=0;
    int num=Integer.parseInt(args[0]);
    for(int i=0;i<a.length;i++)
    {
      if(a[i]==num)
       {
         System.out.println("index "+i);
         flag=1;
       }
   }
   if(flag==0)
    System.out.println("-1");
    }
}