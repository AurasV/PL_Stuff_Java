/**
 * 1211EC / Homework nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class University
{
    Author[] authors;

    public float computeScore()
    {
        float score = 0;
        for (int i = 0; i < authors.length; i++)
        {
            score = score + authors[i].computeScore();
        }
        return score;
    }
    public Author[] addAuthors()
    {
        Author[] newAuthors = new Author[authors.length + 1];
        for (int i = 0; i < authors.length; i++)
        {
            newAuthors[i] = authors[i];
        }
        return newAuthors;
    }
    public Author[] getAuthors()
    {
        return authors;
    }
    public void setAuthors(Author[] authors)
    {
        this.authors = authors;
    }
}
