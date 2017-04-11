/**
 * Created by Olimpia on 4/11/2017.
 */
//sa garescesc nr impare

public class NrOdds {
    public static void main(String[] args) {
        int[] lista={11, 53, 20, 60, 13, 41};

        for (int i= 0;i < lista.length; i++){
            if (lista[i] %2 !=0){
                SkeletonJava.printConsole(lista[i]);
            }
        }

    }
}
