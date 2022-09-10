import java.util.Arrays;
public class string3 
{
    public static void main(String[] args)
    {
        String std[]={"sabriye", "gulsum","soylu"};
        System.out.println(std);
        System.out.println(Arrays.toString(std));

        //çok boyutlu stringler içinse 

        String std2[][]={{"necmiye","soylu"},{"behice","soylu"},{"murat","soylu"},{"sabriye","soylu"}};
        System.out.println(Arrays.deepToString(std2));

        String[][][] std3={};
        System.out.println(Arrays.deepToString(std3));
    }    
}
