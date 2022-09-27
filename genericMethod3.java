public class genericMethod3 
{
    static <generic, generic2> void fonk(generic a, generic2 b)
    {
        System.out.println(a);
        System.out.print(b);
    }    
    public static void main(String[] Soylu)
    {
        int a=10;
        String n="number";
        fonk(a,n);
    }
}
