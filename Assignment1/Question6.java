import java.util.Scanner;
public class Question6 {
        public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            double n=sc.nextDouble();
            String doubleAsString = String.valueOf(n);
            int indexOfDecimal = doubleAsString.indexOf(".");
            String whole_val=doubleAsString.substring(0, indexOfDecimal);
            String fraction_val=doubleAsString.substring(indexOfDecimal+1);
            System.out.println(whole_val+" "+fraction_val);
        }

}