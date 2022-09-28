public class foreachString 
{
    public static void main(String[] Soylu)
    {
        String[] str0=new String[]{"kbu","bilgisayar","nuhendisligi"};
        String[][] str=new String[][]{{"necmiye","soylu"},{"cem","karaca"},{"ismail","abi"}};
        for(String a:str0)
            System.out.print(a+" ");

        System.out.println();

        for(String[] x:str)
            for(String y:x)
                System.out.print(y+" ");
    }    
}//dikkat edelim direkt bir string oluşturup bunun teker teker char'larına ulaşmıyoruz. Foreach'i string dizizi için kulllanıyoruz. 
//çünkü string int gibi bir değişken türüdür. dizi oluşturulabilen bir değişken tipi. Şimdi biz bir int değişkenşn ben sadece 3.byte'ına
//ulaşmka istiyorum diyebiliyor muyuz? String'de de durum aynı. 
//bu yüzden cahrAt(), setCharAt() vb fonksiyonlarına ihtiyaç duyarızr:)) 
