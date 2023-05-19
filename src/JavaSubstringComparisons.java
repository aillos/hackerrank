import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparisons {
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            String[] arr = new String[s.length() - k + 1];

            for (int i = 0; i <= s.length() - k; i++) {
                arr[i] = s.substring(i, i + k);
            }

            Arrays.sort(arr);
            smallest = arr[0];
            largest = arr[arr.length - 1];

            return smallest + "\n" + largest;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int k = sc.nextInt();
            sc.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
}
