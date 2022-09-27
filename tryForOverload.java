public class tryForOverload 
{

    static int addition(int a, int b)
    {   
        return a+b;
    }
    static double addition(double a, double b)
    {
        return a+b;
    }
    public static void main(String[] arg)
    {
        int z=10, t=20;
        double m=7.8, n=9.8;
        z=addition(z,t);
        m=addition(m,n);
        System.out.print(z+t);
    }
}
