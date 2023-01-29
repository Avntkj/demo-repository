package javaapplication1;

public class MinMax
{
    int arr[]={3,1,2,4,5};
        int max= arr[0];
        int min= arr[0];
    void ff(){
    for( int i=0;i<arr.length;i++)
    {
        if (arr[i]>max)
        max=arr[i];
        if (arr[i]<min)
        min=arr[i];
        
    } 
    System.out.println(max);
    System.out.println(min);
    }
public static void main(String args[])
{
    MinMax dd= new MinMax();
    dd.ff();
}
}