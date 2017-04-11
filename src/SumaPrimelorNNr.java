/**
 * Created by Olimpia on 4/11/2017.
 */
// sa se calculeze suma primelor n numere naturale
public class SumaPrimelorNNr {
    public static void main(String[] args) {

       int numar =  SkeletonJava.readIntConsole("introduceti un numar");
       int suma = 0;
       for ( int i=1; i <= numar; i++) {
           suma += i;
       }
           SkeletonJava.printConsole(suma);


    }
}
