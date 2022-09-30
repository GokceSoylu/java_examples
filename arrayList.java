import java.util.*;// sınıfı dahil etmeyi unutmayalım
public class arrayList
{
    public static void main(String[] Soylu)
    {
        ArrayList<String> list=new ArrayList<>();// listemizi oluşturduk
        
        list.add("ismail abi");// add fonksiyonu ile rahatlıkla listemize eleman ekleyebiliriz
        list.add("erdal bakkal");
        list.add("mecnun");
        
        list.remove(1);// remove fonksiyonu ile listenin istediğimiz elemanını listeden çıkartabiliriz
        
        list.add(1,"yavuz");// listenin belli bir yerine eleman eklemek için kullanılan ekleme fonksiyonu
    
        /*------- şimdi LinkedList için -------*/

        LinkedList<String> list_=new LinkedList<>(); //listemizi oluşturuyoruz
        
        list_.add("soylu");
        list_.add("manisa");
        list_.add("karaca");

        list_.remove(1);
        
        list_.add(3,"cem");// gördüğün gibi metodlar arraylist ve linkedlist için aynı :))
    }
}
