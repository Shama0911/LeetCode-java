public class Result {
    public class Student
 {
  public static void main(String[]args)
  {
    int arr[][]={{60,70,80},{40,50,60},{30,40,50}};
    int avg=0; 
    int count=0;
        for(int i=0;i<arr.length;i++)
     {
        int sum=0;
       // int count=0;
       for(int j=0;j<arr[i].length;j++)
       {
          sum=sum+arr[i][j];
         //avg=sum/arr[i].length;

       }
       avg=sum/arr[i].length;
    // System.out.println(avg);
      if(avg>=50)
      {
        count++;
      }
    }
    System.out.println(count);
  }
}
    
}
