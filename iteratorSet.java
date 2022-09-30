import java.util.*;
import java.io.*;
public class iteratorSet
{
    public static void main(String[] Soylu)
    {
        ArrayList list=new ArrayList();
        list.add("cem karaca");
        list.add("barış manço");
        list.add("anadolu");
        ListIterator itr=list.listIterator();
        while(itr.hasNext())// görüğün gibi hasNext() sadece bir sonraki var mı diye kontrol eder ilerletmez next() ilerletir
            System.out.println(itr.next());
        System.out.println();
        
        itr.previous();//son elemadan sonra listenin dışına çıktı null'a geldi gibi düşünelim. son elemana tekrar gelmek için previous() fonksiyonunu çalıştırdık
        itr.set("anadolu rock");//görüldüğü üzere itr üzerinde bulunduğu elemnanı değiştiri. değişiklikler kalıcı olur liste  sonuçta
        
        ListIterator itr2=list.listIterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());    
    }    
}
