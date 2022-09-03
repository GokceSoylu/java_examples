import java.util.Scanner;
public class condition 
{
    public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
        double vki;
        System.out.println("vucut kitle indeksinizi giriniz ");
        vki=in.nextDouble();
        if(vki<25)
            System.out.println("kilonuz normalin altindadir");
        else if(vki>=25 && vki<30)
            System.out.println("kilonuz tamamen normaldir ");
        else
            System.out.println("kilonuz normalin üzerindedir. ");
        in.close();
    }
    
}// görüldüğü ğzere if-else partı c ile tamamen aynı
