/**
 * 1211EC / Homework nr 3
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Main
{
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return(Math.sqrt((Math.pow((x1 - x2), 2)) + Math.pow((y1 - y2), 2)));
    }
    public static double[][] matrixAdd(double m1[][], double m2[][])
    {
        for(int i = 0; i < m1.length; i++)
            for(int j = 0; j < m2[0].length; j++)
                m1[i][j] = m1[i][j] + m2[i][j];
        return m1;
    }
    public static double matrixDiagSum(double m3[][])
    {
        double sum = 0;
        for(int i = 0; i < m3.length; i++)
            sum = sum + m3[i][i];
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(distance(0,0,4,5));
        double m1[][] = {{4,5,6},{7,8,9},{12,13,14}};
        double m2[][] = {{4,5,6},{1,2,3},{4,5,6}};
        matrixAdd(m1,m2);
        for(int i = 0; i < m1.length; i++ )
        {
            System.out.println();
            for(int j = 0; j < m1[0].length; j++)
                System.out.print(m1[i][j] + " ");

        }
        double m3[][] = {{4,5,6},{2,3,8},{21,23,25}};
        System.out.println();
        System.out.println(matrixDiagSum(m3));
    }
}
