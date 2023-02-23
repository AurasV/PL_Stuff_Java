/**
 * 1211EC / Homework nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Author
{
    String name;
    Publication[] publications;
    University university;
    public float computeScore()
    {
        float score = 0;
        for (int i = 0; i < publications.length; i++)
        {
            score = score + publications[i].computeScore();
        }
        return score;
    }
    public Publication[] addPublications()
    {
        Publication[] newPublications = new Publication[publications.length + 1];
        for (int i = 0; i < publications.length; i++)
        {
            newPublications[i] = publications[i];
        }
        return newPublications;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Publication[] getPublications()
    {
        return publications;
    }
    public void setPublications(Publication[] publications)
    {
        this.publications = publications;
    }
    public University getUniversity()
    {
        return university;
    }
    public void setUniversity(University university)
    {
        this.university = university;
    }
}
