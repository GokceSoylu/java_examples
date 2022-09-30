import java.util.*;
public class IteratorAdd 
{
    public static void main(String[] Soylu)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("polat");
        list.add("memati");
        list.add("abduley");

        ListIterator <String>itr=list.listIterator();//bir nevi pointer atıyormuşuz gibi düşünelim
        
        itr.add("elif");
        
        System.out.println(itr.previous());
        System.out.println();

        while(itr.hasNext())
            System.out.println(itr.next());
        System.out.println();
        
        ListIterator<String> itr2=list.listIterator();
        itr2.next();
        itr2.set(itr.previous());
        
        while(itr2.hasPrevious())
            System.out.println(itr2.previous());        
    }    
}
/* Output
    elif

    elif
    polat
    memati
    abduley

    abduley
*/