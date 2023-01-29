package javaapplication1;

public class sumOfArray {
    
    int arr[]={3,1,2,4,5};
    
    void sum()
    {
      int su=0,i;
      for(i=0;i<arr.length;i++)
      {
         su = su+arr[i];
         System.out.println(arr[i]);
      }
      System.out.println("Sum of array = " +su);
    }
    
    public static void main(String h[])
    {
        sumOfArray ss= new sumOfArray();
        ss.sum();
    }
}
