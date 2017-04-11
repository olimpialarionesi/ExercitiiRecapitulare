/**
 * Created by Olimpia on 4/11/2017.
 */
public class MaximDinArray {
    public static void main(String[] args) {
        //nr. maxim din lista
        int[] lista={10, 52, 20, 60, 12, 41};
        int max = 0;
        for ( int i=0; i< lista.length; i++)
        {
            if (lista[i]> max)
            {
             max=lista[i];

            }

        }

        SkeletonJava.printConsole(max);
    }
}
