public class Question4 {
    public static void main(String args[]){
        int a=1,b=2,c=3;
        swaptwonum(a,b);
        swapthreenum(a,b,c);
    }
    static void swaptwonum(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    static void swapthreenum(int a,int b,int c)
    {
        int temp;
        temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println(a+" "+b+" "+c);
    }
}
