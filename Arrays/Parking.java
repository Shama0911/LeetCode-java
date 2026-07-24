public public class Parking
{
  public static void main(String[]args)
   {
    int P[][]={{0,1,0},{1,1,1},{1,1,1}};
     for(int i=0;i<P.length;i++)
    {
     int sum=0;
     
      for(int j=0;j<P[i].length;j++)
       {
        sum=sum+P[i][j];
       }
       if(sum>=3)
       {
        System.out.println(sum);
       }
     }
    }
  }
  {
    
}
