import java.time.LocalDate;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
}

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

       System.out.println(Result.findDay(month, day, year));
    }
}