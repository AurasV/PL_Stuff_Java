/**
 * 1211EC / Homework nr 7
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Share {
    private Company company;
    private double value;
    
    public Share(double value, Company company) {
      this.company = company;
      this.value = value;
    }
    
    public Company getCompany() {
      return company;
    }
    
    public double getValue() {
      return value;
    }
    
    public void setValue(double value) {
      this.value = value;
    }
  }