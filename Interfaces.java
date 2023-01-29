package javaapplication1;
public class Interfaces {
    public static void main(String args[])
    {
        Person p=new Person();
        p.makeVideo();
        p.study();
    }
}
interface Youtuber{
    void makeVideo();
}
interface Student{
    void study();
}
class Person implements Youtuber, Student{
    public void study()
    {
        System.out.println("Person is studying");
    }
    public void makeVideo()
    {
        System.out.println("Person is making videos");
    }
} 