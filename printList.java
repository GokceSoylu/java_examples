import java.util.*;
public class printList 
{
    public static void main(String[] Soylu)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add(i);
        
        Iterator<Integer> a=list.iterator();
        // odaklanalım. Iterator bir sınıf bu sınıftan bir nesne oluşturuyoruz. arraylist objesi ile de iterator() fonksiyonunu çalıştırıyoruz.
        // bu metod obje returluyor. bu returlelnen objeyi yeni oluşturduğumuz nesneye  atıyoruz :))
        // iterator() metodunun Iterotor snıfı ile aynı isimli olmasına aldanmayınız ArrayList 'in objesi çalıştırdığına göre ArrayList sınıfına ait :))
        
        // peki bukadar işi neden yaptık? Iterator sınıfındaki metodlar ile listemizde dolaşacağız :))

        while(a.hasNext())
            System.out.println(a.next());
    
        //Iterotor sınıfında sıkça kullanacağımız birkaç fonksiyon
        //-> hasNext() bir sonrakinde eleman var mı diye kontrol eder. varsa true döndürür.
        //-> next() bir sonraki elemanı döndürür.
    }    
}
