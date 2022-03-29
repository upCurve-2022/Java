import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print("* ");
            System.out.println();
        }

    }

}