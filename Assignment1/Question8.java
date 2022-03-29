import java.util.Scanner;
public class Question8
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,oddsum=0,evensum=0;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                oddsum = oddsum + i;

            }
        }
        for(int i=0;i<=n;i++) {
            if (i % 2 == 0) {
                evensum = evensum + i;
            }
        }
        System.out.println("even sum="+evensum);


        System.out.println("odd sum="+oddsum);


    }

}