/**
 * 1211EC / Homework nr 10
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Publication extends Journal
{
    String volumeName;
    float impactFactor;
    @Override
    public float computeScore() {
        float score = (impactFactor * 0.5f) / getAuthors();
        return score;
    }

    public String getVolumeName()
    {
        return volumeName;
    }
    public void setVolumeName(String volumeName)
    {
        this.volumeName = volumeName;
    }
    public float getImpactFactor()
    {
        return impactFactor;
    }
    public void setImpactFactor(float impactFactor)
    {
        this.impactFactor = impactFactor;
    }
}
