package javaapplication1;

public class setterGetter {
    
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        c.setY(12);
        System.out.println(c.getY());
    }
    
}
class Calculator
{
    private int x;
    private int y;
    
    public void setX(int i)
    {
        x=i;
    }
    public void setY(int j)
    {
        y=j;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    //this is method overloading/complie-time polymorphism
}
