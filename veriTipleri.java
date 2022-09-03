public class veriTipleri
{
    public static void main(String[] args)
    {
        int a=10, e=20, f=7;
        float b=12.4f;
        double c=1.878;
        String string="Necmiye Soylu";
        char d='T';
        boolean x=true;
        System.out.printf("%na = "+a+"%nb = "+b+"%nc = "+c+"%nd = "+d+"%nstring = "+string+"%nx = "+!x+"%n");
        
        //?     System.out.printf(a/e+7);   dikkat  printf ile bu şekilde yazdıramayız
        
        System.out.println(a/e+f);
        System.out.println((float)a/e+f);
        System.out.println(a/b);
        System.out.println(a/c);
        
        System.out.println(a/e);    //* dikkkat edelim sadece int/int yaptığımızda ondalıklı kısmı atarak böldü 
        //*     (float)a=(float)a/b;    evet komik zaten boyle bir sey yapılamaz
        b=(float)a/b;// tabi bu mümkün. su oturdu sanırım mantık:))
        System.out.println(b);
    }
}
/*  
    *println ile direk islemi yazıp sonucu yazdırabilriz
    *printf ile bu sekilde yazdıramayız
    *int/int bölmede tam sayı bölme yapar. Eğer ondalıklı bölme yapmasını istiyorsak başına (float ) yada (double) yazabiliriz.
    *int/double yada int/float bölmede ise ondalıklı bölme yapar
*/
