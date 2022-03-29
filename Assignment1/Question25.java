import java.util.*;
public class Question25{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String c=" ";
        char b;
        for(int i=0;i<str.length();i++)
        {
            b=str.charAt(i);
            c=b+c;
        }
        System.out.print(c);
    }
}