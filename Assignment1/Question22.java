import java.util.*;
public class Question22 {
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int a=1,b=1,c;
            int n=sc.nextInt();
            System.out.print(a+" "+b+" ");
            for(int i=2;i<n;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
}