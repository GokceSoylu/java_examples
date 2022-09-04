public class println_ 
{
    public static void main(String[] args)
    {

        int a=10,b=20;
        System.out.println(a+b);
        System.out.println("the answer "+a+b);//string gibi degerleri yan yana yazdırıyor
        System.out.println("the answer "+(a+b));//parantez içinin işlemğini yapıp yazdırıyor
        System.out.println("the aswer "+a*b);// * + dan öncelikli --> ez cümle işlem önceliğine vardır
        //! System.out.println("the answer "+a-b); hata verir çünkü işlem önceliği yok. Soldan yazdırmaya baslar aa yı string olarak ekler ama -  ifdesini tanımaz. 
        System.out.println("the answer "+(a-b));
        System.out.println("the answer "+a/b);//tam bolme
        System.out.println("the answer "+(float)a/b);//ondaklıklı bolme
        System.out.println("the anwer "+(float)(a/b));//sonucu float yaptı, float bolmedi :))
    }    
}
/*  output
 *  the aswer 1020
 *  the aswer 30
 *  the answer 200
 *  the aswer -10
 *  the aswer 0
 *  the aswer 0.5
 *  the answer 0.0
 */