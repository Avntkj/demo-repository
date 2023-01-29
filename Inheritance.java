//hierarchal inheritance
class PLANE
  {
      public void takeOff()
      {
            System.out.println("Parent Class");
            System.out.println("Plane takes off");
      }
      public void fly()
      {
          System.out.println("Plane flies");
      }
      public void land()
      {
          System.out.println("Plane lands");
      }
      
}
  class cargoPlane extends PLANE
  {
      public void cargo()
      {
          System.out.println("This plane carries cargo");
      }
  }
  class passengerPlane extends PLANE
  {
     public void passenger()
     {
         System.out.println("This plane carries passengers");
     }
  }
  class fighterPlane extends PLANE
  {
      public void weapons()
      {
          System.out.println("This planme carries weapons");
      }
  }
  public class Inheritance
  {
  public static void main(String args[])
  {
      fighterPlane f1=new fighterPlane();
      f1.weapons();
      f1.takeOff();
      f1.fly();
      f1.land();
      System.out.println("_____________________");
      passengerPlane p1= new passengerPlane();
      p1.passenger();
      p1.takeOff();
      p1.fly();
      p1.land();
  }
}


