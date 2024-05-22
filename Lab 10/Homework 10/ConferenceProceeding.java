/**
 * 1211EC / Homework nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class ConferenceProceeding extends Publication
{
    String volumeName;
    boolean indexed;

    @Override
    public float computeScore()
    {
        float score;
        if (isIndexed())
        {
            score = (getImpactFactor() * 0.25f) / getAuthors();
        }
        else
        {
            score = (getImpactFactor() * 0.2f) / getAuthors();
        }
        return score;
    }
    public String getVolumeName() {
        return volumeName;
    }
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
    public boolean isIndexed() {
        return indexed;
    }
    public void setIndexed(boolean indexed) {
        this.indexed = indexed;
    }
}
