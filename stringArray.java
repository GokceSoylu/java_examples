public class stringArray 
{
    public static void main(String [] args)
    {
        String str1="necmiye";
        String str2=new String("necmiye");
        String str3=new String(str2);
        String str4;
        //! String str={"necmiye"};    wrong
        //! String str='necmiye';  wrong

        str1="soylu";//? wooww sonradan değiştirilebiliyor c'deki char array gibi değil!
        System.out.println(str1);
        str4="sabriye";
        
        System.out.println(str3);
        System.out.println(str4);        
    }

}
