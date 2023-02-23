/**
 * 1211EC / Homework nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab6HwEx2 {
    public static void main(String[] args) {
      Product product1 = new Product("Bread", 10000);
      Product product2 = new Product("Milk", 25000);
      Product product3 = new Product("Sugar", 52000);
  
      product1.displayProduct();
      product2.displayProduct();
      product3.displayProduct();
  
      product1.setPriceInRON(product1.getPriceInRON() + 10.25);
      product2.setPriceInRON(product2.getPriceInRON() + 10.25);
      product3.setPriceInRON(product3.getPriceInRON() + 10.25);

      product1.displayProduct();
      product2.displayProduct();
      product3.displayProduct();
  
      System.out.println("Price in RON for Bread: " + product1.getPriceInRON() + " RON");
      System.out.println("Price in RON for Milk: " + product2.getPriceInRON() + " RON");
      System.out.println("Price in RON for Sugar: " + product3.getPriceInRON() + " RON");
    }
  }
  