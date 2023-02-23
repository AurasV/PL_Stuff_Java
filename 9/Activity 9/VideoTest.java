/**
 * 1211EC / Lab nr 9
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class VideoTest {
    public static void main(String[] args) {
        // Create first video object using first constructor
        Video v1 = new Video("The Matrix");
        v1.show();

        // Create second video object using second constructor
        Video v2 = new Video("The Wolf of Wall Street", 180);
        v2.show();
    }
}
