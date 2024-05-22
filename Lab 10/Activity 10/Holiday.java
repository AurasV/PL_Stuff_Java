/**
 * 1211EC / Lab nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Holiday extends Card {
    public Holiday(String recipient) {
        this.recipient = recipient;
    }
    @Override
    public void greeting() {
        System.out.println("Dear " + recipient + ", ");
        System.out.println("Season's Greetings!");
    }
}
