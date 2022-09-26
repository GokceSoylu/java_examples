public class string_eleman 
{
    public static void main(String[] args)
    {
        String str="kbu";
        StringBuilder str2=new StringBuilder(str);
        str2.setCharAt(1,'t');
        System.out.println(str2);
        String str_new=new String(str2);
        str=str_new;
    }
    
}
