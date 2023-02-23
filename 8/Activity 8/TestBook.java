/**
 * 1211EC / Lab nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class TestBook {
    public static void main(String[] args) {
      // Create an Author object
      Author anAuthor = new Author("Student", "student@upb.ro", 'm');
      
      // Create a Book object using the Author object
      Book aBook = new Book("Java for dummies", anAuthor, 19.95, 1000);
      
      // Test the getName, getAuthor, getPrice, and getQtyInStock methods
      if (aBook.getName().equals("Java for dummies") && aBook.getAuthor().equals(anAuthor) &&
          aBook.getPrice() == 19.95 && aBook.getQtyInStock() == 1000) {
        System.out.println("Book constructor and get methods test passed");
      } else {
        System.out.println("Book constructor and get methods test failed");
      }
      
      // Test the setPrice and setQtyInStock methods
      aBook.setPrice(29.95);
      aBook.setQtyInStock(999);
      if (aBook.getPrice() == 29.95 && aBook.getQtyInStock() == 999) {
        System.out.println("setPrice and setQtyInStock methods test passed");
      } else {
        System.out.println("setPrice and setQtyInStock methods test failed");
      }

      // Test the toString method
        String expectedOutput = "'Java for dummies' by Student (m) at student@upb.ro";
        if (aBook.toString().equals(expectedOutput)) {
            System.out.println("toString method test passed");
        } else {
            System.out.println("toString method test failed");
        }
    }
}
