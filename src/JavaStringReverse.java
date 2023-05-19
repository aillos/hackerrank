import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder reverse = new StringBuilder();

        for (int i=A.length()-1;i>=0;i--){
            reverse.append(A.charAt(i));
        }

        System.out.println(A.equals(reverse.toString()) ? "Yes" : "No");

    }
}

