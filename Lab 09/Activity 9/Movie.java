/**
 * 1211EC / Lab nr 9
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Movie extends Video {
    private String director;
    private int rating;

    public Movie(String title, int length, String director, int rating) {
        super(title, length);
        this.director = director;
        this.rating = rating;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}
