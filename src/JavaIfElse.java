import java.util.*;

public class JavaIfElse {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();
        if ((N<5 || N>20) && N%2==0){
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }
    }
}
