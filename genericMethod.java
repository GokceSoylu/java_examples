public class genericMethod 
{
    public static void main(String[] Soylu)
    {
        char x='A';
        add(x);
    }    
    static <T> void add(T t)
    {
        System.out.println("the element is "+ t);
    }

}   
//önce aynı isimli fakat farklı paremetre alan ve gönderilen paremetre listesinden hangi fonksiyonun bulunabildii kod yazdı şimdi ise
//işi biraz daha abartıp overloded yapmaya gerek yok biz tipi belli olmayan fonksiyon yazalım dedik bunu bir örnke olarak sadadce boyle
//bir şeytin var olduğunu b,lel,im diye koydum. Dha derin oop kısmında öğrenicez :))