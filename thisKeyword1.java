package javaapplication1;
class Hello {
    private int x;
    private int y;
    
    public void setX(int x)
    {
        this.x=x;
    }
}
public class thisKeyword1
{
    public static void main(String ag[])
    {
       Hello wow = new Hello();
       wow.setX(5);
    }
}
