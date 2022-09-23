public class rekursif 
{
    static void f(int x, int y)
    {
        if(x==0)
            return;
        f(x-1, y+x);
        System.out.printf("%n%d %d",x,y);
        f(x-1, y+x);
    }
    public static void main(String[] Soylu)
    {
        f(3,5);
    }   
}
//nasıl beynin yandı dimi. tabi yanar sınav sorusu bu:)) 