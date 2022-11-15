import java.util.Random;
public class Rand
{
    public static void main(String[] Soylu)
    {
        Random rand=new Random();
        int a=rand.nextInt();
        int b=rand.nextInt(10);
        
        double c=rand.nextDouble();
        double d=rand.nextDouble(10.0);

        System.out.printf("%d%n%d%n%f%n%f",a,b,c,d);
    }
    
}