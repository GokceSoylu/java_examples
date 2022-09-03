import java.util.Scanner;
public class input 
{
    public static void main(String args[])
    {
        int a,b;
        float x,y;
        double z,t;
        char m;
        String w; 
        Scanner ns=new Scanner(System.in);
        
        //todo string ve cahr input'u bir tık farklı dikkat eddelim
        //todo  Char
        System.out.printf("%ncahr m = ");
        m=ns.nextLine().charAt(0);
        System.out.printf("m = %c%n++m = %c",m,++m);
        
        //todo  String
        System.out.printf("%nstring w = ");
        w=ns.nextLine();
        System.out.printf("%nw = %s",w);

        //todo  int
        System.out.printf("%nint a = ");
        a=ns.nextInt();
        System.out.printf("%nint b = ");
        b=ns.nextInt();
        System.out.printf("%na + b = %d",a+b);
        
        //todo  float
        System.out.printf("%nflaot x = ");
        x=ns.nextFloat();
        System.out.printf("%nflaot y = ");
        y=ns.nextFloat();
        System.out.printf("%nx + y = %f",x+y);

        //todo  double
        System.out.printf("%ndouble z = ");
        z=ns.nextDouble();
        System.out.printf("%ndouble t = ");
        t=ns.nextDouble();
        System.out.printf("%nz + t = %f",z+t);
        ns.close();//kapatıyoruz
    }
}
//* Scanner bir class bu class'tan bir nesne oluşturuyoruz. Daha sonra bu nesne ile input alma methodlarına ulaşıyoruz:)