/**
 * 1211EC / Lab nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Car {
    private double startKm;
    private double endKm;
    private double liters;
  
    public Car(double startOdo, double endingOdo, double liters) {
      this.startKm = startOdo;
      this.endKm = endingOdo;
      this.liters = liters;
    }
  
    public double calculateLKM() {
      return (endKm - startKm) / liters;
    }
  }
  