/**
 * 1211EC / Lab nr 9
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Video {
    private String title;
    private int length;
    private boolean available;

    // Constructor with one parameter
    public Video(String title) {
        this.title = title;
        this.length = 90;
        this.available = true;
    }

    // Constructor with two parameters
    public Video(String title, int length) {
        this.title = title;
        this.length = length;
        this.available = true;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length);
        System.out.println("Available: " + available);
    }
}
