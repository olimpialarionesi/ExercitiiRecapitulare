/**
 * Created by Olimpia on 4/11/2017.
 */
public class MediaArray {
    public static void main(String[] args) {

        int[] listanr = { 2, 4, 6, 8, 10};
        int z = 0;
        double x = 0;
        for ( int i = 0; i < listanr.length; i++) {
            z = z + listanr[i];
            // z += listanr[i]

            x = z / listanr.length;
        }
        SkeletonJava.printConsole("suma este "+ z) ;
            SkeletonJava.printConsole("media este "+ x) ;




    }
}
