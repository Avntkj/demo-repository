package javaapplication1;
public class variables
{
public static void main(String args[])
{
    localInstanceCheck lv=new localInstanceCheck();
    lv.getData();
    lv.getLocal();
}
}

class localInstanceCheck {
    String name;
    int age;
    String address;
    float f;
    public void getData()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(f);
        
    }
    public void getLocal()
    {
        int i=0;
        System.out.println(i);
    }
}
