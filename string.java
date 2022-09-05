import java.util.Scanner;
public class string 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        String str;
        str=in.nextLine();

        String str2;
        str2=in.nextLine();

        char a=str.charAt(0);
        char b=str2.charAt(0);

        System.out.printf("%c %c%n",a,b);
        System.out.println(a);
        System.out.println(b);
    }    
}
