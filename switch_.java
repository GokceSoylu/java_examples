import java.util.Scanner;
public class switch_ 
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int a, b;
        char process;
        process=in.nextLine().charAt(0);
        a=in.nextInt();
        b=in.nextInt();
        switch(process)
        {
            case '+':   System.out.println(a+" "+process+" "+b+" = "+a+b); break;
            case '-':   System.out.println(a+" "+process+" "+b+" = "+(a-b)); break;
            case '/':   System.out.println(a+" "+process+" "+b+" = "+(float)a/b); break;
            case 'x':   System.out.println(a+" "+process+" "+b+" = "+a*b); break;
            default: System.out.printf("%nyanis giris yapildi");
        }
        in.close();
    }    
}
// görüldüğü üzere switch-case yapısıda c ile aynı