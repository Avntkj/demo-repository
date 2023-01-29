class Calc 
{
     int add(int x, int y) 
     {
         return x+y;
     }
     float add(int x, float y)
     {
         return x+y;
     }
     int add(int x, int y, int z)
     {
         return x+y+z;
     }
}
public class Calculator
{
public static void main (String args[])
{
    Calc c=new Calc();
    System.out.println(c.add(5, 9));
}
}
