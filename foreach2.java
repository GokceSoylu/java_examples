public class foreach2 
{
    public static void main(String[] Soylu)
    {
        int array[]={1,2,3,4,5};
        
        for(int m=0;m<array.length;m++)
        {
            int i=array[m];
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        for(int i:array)
            System.out.print(i+" ");
    }    
}//ikisi de aynı. yukarıdakini foreach'in açılımı gibi düşünebiliriz
