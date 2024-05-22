/**
 * 1211EC / Homework nr 7
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Portfolio {
    private Share[] shares;
    private int noShares;
    
    public Portfolio(int maxShares) {
      shares = new Share[maxShares];
      noShares = 0;
    }
    
    public double computeSum() {
      double sum = 0;
      for (int i = 0; i < noShares; i++) {
        sum += shares[i].getValue();
      }
      return sum;
    }
    
    public void addShare(Share s) {
      if (noShares < shares.length) {
        shares[noShares] = s;
        noShares++;
      }
    }
  }
  
