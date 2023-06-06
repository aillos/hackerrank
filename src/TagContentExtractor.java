import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        String regex = "<(.+)>([^<>]+)(</\\1>)";
        Pattern pattern = Pattern.compile(regex);
        while(testCases-- >0){
            String line = sc.nextLine();
            Matcher match = pattern.matcher(line);
            int counter = 0;
            while (match.find()) {
                if (match.group(2).length() > 0) {
                    System.out.println(match.group(2));
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println("None");
            }
        }
        sc.close();
    }
}
