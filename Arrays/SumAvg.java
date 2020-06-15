public class SumAvg
{
  public static void main(String args[])
   {
     int a[]={22,0,44,77,89};
     int n=a.length;
     int sum=0;
      for(int i=0;i<n;i++)
       sum=sum+a[i];
     float avg=sum/n;
      System.out.println("sum ="+sum);
      System.out.println("avg ="+avg);
   }
}