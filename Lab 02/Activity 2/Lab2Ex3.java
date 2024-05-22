/**
 * Lab2Ex3
 */
public class Lab2Ex3 {

    public static void main(String[] args) {
        String s = "I am first year student now";
        int nra=0, nre=0, nri=0, nro=0, nru=0;
        char voc;
        for (int count = 0; count <s.length(); count++)
        {
            voc = s.charAt(count);

            switch (voc) {
                case 'a': nra++;
                break;

                case 'e': nre++;
                break;

                case 'i': nri++;
                break;

                case 'o': nro++;
                break;

                case 'u': nru++;
                break;

                case 'A': nra++;
                break;

                case 'E': nre++;
                break;

                case 'I': nri++;
                break;

                case 'O': nro++;
                break;

                case 'U': nru++;
                break;
            }
        }
        System.out.println("a = " + nra);
        System.out.println("e = " + nre);
        System.out.println("i = " + nri);
        System.out.println("o = " + nro);
        System.out.println("u = " + nru);
    }
}