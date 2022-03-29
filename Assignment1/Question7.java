import java.util.Scanner;
public class Question7 {
    public static void main(String args[]){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>=b&&a>=c){
            System.out.println("first largest:"+a);
            if(b>=c){
                System.out.println("second largest:"+b);
            }
            else{
                System.out.println("second largest:"+c);
            }

        }
        else if(b>=a && b>=c)
        {
            System.out.println("first largest:"+b);
            if(a>=c)
            {
                System.out.println("second largest:"+a);
            }
            else
            {
                System.out.println("second largest:"+c);
            }
        }
        else {
            System.out.println("first largest:"+c);
            if(a>=b){
                System.out.println("second largest:"+a);
            }
            else
            {
                System.out.println("second largest:"+b);
            }
        }
    }

}
