public class overloadedMethod 
{
    public static void main(String[] Soylu)
    {
        int a=10;
        double b=1.2;
        char c='A';
        f(a);
        f(b);
        f(c);
    }     
    static void f(int a)
    {
        System.out.println("int "+a);
    } 
    static void f(double b)
    {
        System.out.println("float " + b);
    }
    static void f(char c)
    {
        System.out.println("char "+ c);
    }
}
// √overloading 
// overriding  sadece aynı isim
// tipsiz :))