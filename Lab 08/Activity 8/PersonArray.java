/**
 * 1211EC / Lab nr 8
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class PersonArray {

    private Person[] person;
    private int noData;

    public PersonArray(int dimension){
        this.person = new Person[dimension];
        this.noData = 0;
    }

    public void insert(String lastName, String firstName, int age){
        person[noData++] = new Person(lastName, firstName, age);
    }

    public Person find(String searchName)
    {
        for(int i = 0; i < noData; i++)
        {
            if(person[i].getLast().equals(searchName))
            {
                return person[i];
            }
        }
        return null;
    }

    public boolean delete(String searchName)
    {
        int i;
        for(i = 0; i < noData; i++)
        {
            if(person[i].getLast().equals(searchName))
            {
                break;
            }
        }
        if(i == noData)
        {
            return false;
        }
        else
        {
            for(int j = i; j < noData - 1; j++)
            {
                person[j] = person[j+1];
            }
            noData--;
            return true;
        }
    }

    public void displayArray() {
        for(int i = 0; i < noData; i++)
        {
            System.out.println();
            person[i].displayPerson();
        }
    }
}
