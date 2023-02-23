/**
 * 1211EC / Homework nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
abstract public class Journal
{
    String name;
    String date;
    int authors;
    abstract public float computeScore();
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public int getAuthors()
    {
        return authors;
    }
    public void setAuthors(int authors)
    {
        this.authors = authors;
    }
}
