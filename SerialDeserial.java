import java.io.*;

public class SerialDeserial {
    public static void main(String[] args) throws ClassNotFoundException {
        Car c = new Car("BMW", "White", 8000000);
        // Location Byte Stream
        String filename = "C:\\Users\\hp\\OneDrive\\Desktop\\xyx.txt";
        // Serializing
        try {
            FileOutputStream fio = new FileOutputStream(filename);
            // Location
            ObjectOutputStream out = new ObjectOutputStream(fio);
            // For operations
            out.writeObject(c);
            // On Object
            System.out.println("SEARIALIZED DATA SUCCESSFULLY");
            fio.close();
        } catch (IOException e) {
            e.printStackTrace();
        } // Deserializing
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            Car c2 = (Car) in.readObject();// Type Casting!
            System.out.println(c2);
            System.out.println("Object is deserialised");
            in.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

// Encapsulation
class Car implements Serializable {
    private String name;
    private String color;
    private Integer price;

    public Car() {
        // Default Constructor
    }

    // Constructor Overloading
    public Car(String name, String color, Integer price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    // To print the output
    public String toString() {
        return this.name + " " + this.color + " " + this.price;
    }
}
