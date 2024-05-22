/**
 * 1211EC / Lab nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class CardTest {

    public static void main(String[] args) {
        Card card1 = new Holiday("John");
        card1.greeting();

        Card card2 = new Birthday("Mary", 18);
        card2.greeting();
    }
}