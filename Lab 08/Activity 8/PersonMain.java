/**
 * 1211EC / Lab nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Scanner;
public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonArray person = new PersonArray(5);
        person.insert("Laura", "Alexandru", 22);
        person.insert("Aurel", "Frimu", 24);
        person.insert("Marian", "Nisip", 26);
        person.insert("Smith", "Jane", 28);
        person.insert("Putred", "Vior", 30);
        person.displayArray();

        System.out.println("Enter last name to search for: ");
        String findName = scanner.nextLine();

        Person search = person.find(findName);

        if(search != null)
        {
            System.out.println("Found: ");
            search.displayPerson();
        }
        else
        {
            System.out.println("Not found");
        }

        System.out.println("Enter last name to delete: ");
        String deleteName = scanner.nextLine();

        if(person.delete(deleteName))
        {
            System.out.println("Deleted: " + deleteName);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
