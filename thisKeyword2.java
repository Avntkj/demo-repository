package javaapplication1;

public class thisKeyword2 {

    public static void main(String h[]) {
        ConstOverloading peck = new ConstOverloading(2,3);

    }
}

class ConstOverloading {

    private int x;
    private int y;

    //default constructor
    ConstOverloading() {
    }

    //constructor overloading
    ConstOverloading(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x);
    }
}
