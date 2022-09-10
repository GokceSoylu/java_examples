public class string2 
{
    public static void main(String[] args)
    {
        //stringin belli bir elemanını yazdırma
        String std="Necmiye";
        System.out.println(std.charAt(0));

        //std.charAt(0)='t';        Bu fonksiyon stringin istediğimiz elamanına ulaşıp bize veriyor. ancak o elemana direkt ulaşmamızı sağlamıyor;

        String std2[]={"n","e","c","m","i","y","e"};
        String std3[]={"necmiye","soylu"};
        char char1[]={'n','e','c','m','i','y','e'};
        System.out.println(std2[0]);
        std3[1]="sabriye";
        System.out.println(std3[1]);
        char1[0]='t';
        System.out.println(char1);
        System.out.println(std3[0].charAt(2));       

        StringBuilder std4=new StringBuilder(std);
        std4.setCharAt(0,'s');
        System.out.println(std4);
        //! evet ilginç ama stringin bir elemanını değiştiremeyiz değiştirmek istersek bu yöntemi kullamalıyız

        std3[0]=new String(std4);
        System.out.println(std3[0]);// 💃🏻
    }

}
