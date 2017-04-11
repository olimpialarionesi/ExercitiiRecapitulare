/**
 * Created by Olimpia on 4/11/2017.
 */
//sa se calculeze factorialul unui nr n
public class FactorialulUnuiNumar {
    public static void main(String[] args) {
        int n=10;
        long factorial = 1;
        for (int i= 1; i<=n;i++){

            factorial *= i;
        }
        SkeletonJava.printConsole("factorialul numarului " + n + " = " + factorial);
    }
}
