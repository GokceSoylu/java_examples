public class genericMethod2 
{
    public static void main(String[] Soylu)
    {
        int a=10, b=20;
        System.out.print(fonk(a,b));

    }    
    static <tipsiz> tipsiz fonk(tipsiz x, tipsiz y)
    {
        x=y;
        return x;
    }
}
