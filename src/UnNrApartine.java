/**
 * Created by Olimpia on 4/11/2017.
 */
//se da u numar sa se afiseze true daca numarul apartine intervalului 9-24, altfel sa se afiseze fals.
public class UnNrApartine {
    public static void main(String[] args) {
        int d = SkeletonJava.readIntConsole("introduceti un numar");
        if ( d>9 && d<24)
        {SkeletonJava.printConsole("true");}
        else SkeletonJava.printConsole("fals");


    }
}
