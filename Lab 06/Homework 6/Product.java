/**
 * 1211EC / Homework nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Product {
    private String name;
    private double price;
  
    public Product(String name, double price) {
      this.name = name;
      this.price = price;
    }
  
    public void displayProduct() {
      System.out.println("Product: " + name + ", price: " + price + " ROL");
    }
  
    public double getPrice() {
      return price;
    }
  
    public void setPrice(double price) {
      this.price = price;
    }
  
    public double getPriceInRON() {
      return price / 10000.00;
    }
    
    public void setPriceInRON(double priceInRON) {
      this.price = priceInRON * 10000.00;
    }
    
  }
  