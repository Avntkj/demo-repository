public class fibonacciSeries {
    
    public static void main(String g[])
    {
        int a=0,b=1,counter=0;
        while(counter<5)
        {
            System.out.print(a+" ");
            //swap
            int c=a+b;
            a=b;
            b=c;
            counter++;
        }
    }
}
