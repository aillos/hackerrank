import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        BigInteger num = new BigInteger(s);
        if (num.isProbablePrime(1)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
