import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x = a;
            for (int j = 0; j < n; j++) {
                x += (Math.pow(2, j) * b);
                System.out.print(x + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
