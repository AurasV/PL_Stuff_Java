/**
 * 1211EC / Homework nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class UniversityTest
{
    public static void main(String[] args)
    {
        University university = new University();
        Author[] authors = new Author[2];
        authors[0] = new Author();
        authors[1] = new Author();
        authors[0].setUniversity(university);
        authors[1].setUniversity(university);
        authors[0].setName("Author 1");
        authors[1].setName("Author 2");

    }
}