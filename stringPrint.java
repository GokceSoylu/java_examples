import java.util.Arrays;
public class stringPrint 
{
    public static void main(String[] Soylu)
    {
        int i;
        String[] str={"necmiye","soylu","kbu"};
        for(i=0;i<3;i++)
            System.out.print(str[i]+"  ");
        System.out.println(str); //buarada dizinin içeriğini yazdıramayız
        System.out.println(Arrays.toString(str));

    }    
}
/* Output 
* necmiye  soylu  kbu  
* [Ljava.lang.String;@251a69d7
* [necmiye, soylu, kbu]
*/