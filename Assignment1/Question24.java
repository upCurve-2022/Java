import java.util.*;
public class Question24{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("X=");
        int X=sc.nextInt();
        System.out.print("n=");
        int N=sc.nextInt();
        int a=1;
        while(N>0){
            a=a*X;
            N--;
        }
        System.out.println(a);
    }
}
