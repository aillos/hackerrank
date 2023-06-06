import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "^[a-z,A-Z][a-z0-9_,A-Z]{7,29}$";
}

public class ValidUsernameRegularExpression {

        private static final Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(sc.nextLine());
            while (n-- != 0) {
                String userName = sc.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
}
