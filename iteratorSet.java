import java.util.*;
public class iteratorSet
{
    public static void main(String[] Soylu)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("cem karaca");
        list.add("barış manço");
        list.add("anadolu");
        ListIterator<String> itr=list.listIterator();
        while(itr.hasNext())// görüğün gibi hasNext() sadece bir sonraki var mı diye kontrol eder ilerletmez next() ilerletir
            System.out.println(itr.next());
        System.out.println();
        
        itr.previous();//son elemadan sonra listenin dışına çıktı null'a geldi gibi düşünelim. son elemana tekrar gelmek için previous() fonksiyonunu çalıştırdık
        itr.set("anadolu rock");//görüldüğü üzere itr üzerinde bulunduğu elemnanı değiştiri. değişiklikler kalıcı olur liste  sonuçta
        
        ListIterator<String> itr2=list.listIterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());    
    }    
}
