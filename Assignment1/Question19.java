import java.util.*;
public class Question19
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int decimal=s.nextInt();
        int[] binary = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}