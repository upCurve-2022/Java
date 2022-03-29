import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,fact=1;
        n=s.nextInt();
        for(int i=n;i>=1;i--)
            fact*=i;
        System.out.println(fact);
    }
}