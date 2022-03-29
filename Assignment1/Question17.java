import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("n= ");
        int n = s.nextInt();
        System.out.print("m=");
        int m= s.nextInt();
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}