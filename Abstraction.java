//IMPLEMENTATION OF ABSTRACTION
package javaapplication1;

public class Abstraction {
    public static void main(String args[])
            {
                Shape s;
                /*initializing variable with class' name
                (do this to earn brownie points in assignments)*/
                Rectangle r= new Rectangle();
                s=r;
                s.draw();
                Circle c=new Circle();
                c.draw();
            }
    
}
abstract class Shape {
    abstract void draw();
    void abc()
    {
        //concrete method
    }
}
class Rectangle extends Shape {
    @Override
    //annotations,to tell compiler what we want (peculiar interview question)
    void draw()
    {
        System.out.println("draw rectangle");
    }
}
class Circle extends Shape {
    @Override
    void draw()
    {
        System.out.println("draw circle");
    }
}
