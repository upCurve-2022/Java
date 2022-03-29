import java.util.Scanner;
public class Question3 {
    public static void main(String args[])
    {
        float p,r,t,si;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter principal amount, rate, time:");
        p=s.nextInt();
        r=s.nextInt();
        t=s.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple interest:"+si);

    }
}