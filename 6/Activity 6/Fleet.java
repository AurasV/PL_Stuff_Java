/**
 * 1211EC / Lab nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Fleet {
    private Car car1;
    private Car car2;
  
    public Fleet(int car1StartOdo, int car1EndingOdo, double car1Liters, int car2StartOdo, int car2EndingOdo, double car2Liters) {
      this.car1 = new Car(car1StartOdo, car1EndingOdo, car1Liters);
      this.car2 = new Car(car2StartOdo, car2EndingOdo, car2Liters);
    }
  
    public double averageLKM() {
      return (car1.calculateLKM() + car2.calculateLKM()) / 2;
    }
  }
  