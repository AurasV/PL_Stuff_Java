/**
 * 1211EC / Lab nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class TestAuthor {
    public static void main(String[] args) {
      // Create an author and call the toString method
      Author anAuthor = new Author("Author", "Author@upb.ro", 'm');
      System.out.println(anAuthor.toString());  // Output: "Author (m) at Author@upb.ro"
      
      // Change the email of the author and display the information
      anAuthor.setEmail("Author@fils.upb.ro");
      System.out.println(anAuthor.toString());  // Output: "Author (m) at Author@fils.upb.ro"
    }
  }
  