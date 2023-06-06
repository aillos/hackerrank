import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = new String[n];

        for (int i=0;i<n;i++){
            s[i]= sc.nextLine();
        }
        Arrays.sort(s, 0, n, Collections.reverseOrder((s1, s2) -> {
            BigDecimal b1 = new BigDecimal(s1);
            BigDecimal b2 = new BigDecimal(s2);
            return b1.compareTo(b2);
        }));

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}