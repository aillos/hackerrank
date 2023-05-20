import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);
        int lines = Integer.parseInt(sc.nextLine());

        for (int i=0;i<lines;i++) {
            String input = sc.nextLine();
            Matcher match = pattern.matcher(input);

            while (match.find()) {
                input = input.replaceAll(match.group(), match.group(1));
            }

            System.out.println(input);

        }
        sc.close();
    }
}
