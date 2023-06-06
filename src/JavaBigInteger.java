import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);
        System.out.println(b.add(a));
        System.out.println(a.multiply(b));
    }
}
