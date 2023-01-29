package javaapplication1;

public class Overriding {
    public static void main(String args[])
    {
        Demo d1=new Demo();
        d1.display();
    }
    
}

class Demo {
    public void display()
    {
        System.out.println("Inside parent");
    }
}

class Demo2 extends Demo{
    public void display()
    {
        System.out.println("Inside child");
    }
}
