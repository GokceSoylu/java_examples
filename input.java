import java.util.Scanner;
public class input 
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner ns=new Scanner(System.in);
        System.out.printf("%na = ");
        a=ns.nextInt();
        System.out.printf("%nb = ");
        b=ns.nextInt();
        System.out.printf("%na + b = %d",a+b);
    }
}
