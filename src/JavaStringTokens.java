import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("[',!?._@]", " ");
        StringTokenizer tokens = new StringTokenizer(input);

        System.out.println(tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}