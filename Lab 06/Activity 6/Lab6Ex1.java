/**
 * 1211EC / Lab nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab6Ex1 {
    public static void main(String[] args) {
      Car car1 = new Car(100, 200, 50);
      Car car2 = new Car(300, 400, 60);
  
      System.out.println("Fuel consumption for car 1: " + car1.calculateLKM() + " liters/km");
      System.out.println("Fuel consumption for car 2: " + car2.calculateLKM() + " liters/km");

      Fleet fleet = new Fleet(100, 200, 50, 300, 400, 60);
      System.out.println("Average fuel consumption for the fleet: " + fleet.averageLKM() + " liters/km");

    }
  }
  