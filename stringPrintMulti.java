import java.util.Arrays;
public class stringPrintMulti 
{
    public static void main(String[] Soylu)
    {
        String str[][]={{"necmiye","soylu"},{"kbu","muhendislik"},{"bilgisayar","mühendislik"}};
        System.out.println(Arrays.deepToString(str));
    }    
}
/* output
* [[necmiye, soylu], [kbu, muhendislik], [bilgisayar, mühendislik]]
*/