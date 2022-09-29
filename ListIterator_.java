import java.io.*;
import java.util.*;
public class ListIterator_ 
{
    public static void main(String[] Soylu)
    {
        ArrayList list=new ArrayList();
        list.add("hasan çelebi");
        list.add("emrullah");
        list.add("1.5 iskender :)");

        ListIterator itr=list.listIterator();
        
        while(itr.hasNext())
            System.out.println(itr.next());

        //LİstIterator'ın sahip olduğu metodlar
        //hasPrevious() previous() previousIndex() nextIndex() add() set()

        
    }    
}
