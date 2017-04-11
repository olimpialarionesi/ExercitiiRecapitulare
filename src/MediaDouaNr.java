/**
 * Created by Olimpia on 4/11/2017.
 */
public class MediaDouaNr {
    public static void main(String[] args) {

       //se dau doua nr calculeaza media lor

        int a = SkeletonJava.readIntConsole("intoduceti un numar");
        int b = SkeletonJava.readIntConsole("introduceti un numar");
        double x = (a+b)/2.0;
        SkeletonJava.printConsole("Media numerelor " + a + " si " + b + " este " + x);
    }
}
