/**
 * 1211EC / Lab nr 9
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class MovieTest {
    public static void main(String[] args) {
        // Create Video object
        Video v1 = new Video("The Matrix");
        v1.show();

        // Create Movie object
        Movie m1 = new Movie("The Wolf of Wall Street", 180, "Martin Scorsese", 9);
        m1.show();
    }
}
