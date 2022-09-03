import java.util.Scanner;
public class arrays 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int array[]=new int[10];//* C'den farkı bos dizinin içerisini 0 yapar :) 
        int array2[]={1,2,3,4,5,6,7,8,9,10}, i;
        for(i=0;i<10;i++)
        {
            array[i]=in.nextInt();
            array[i]+=array2[i];
        }  
        for(i=0;i<10;i++)
            System.out.printf("%d\t",array[i]);
        
            String s[]={"necmiye","sabriye","murat","behice"};
            System.out.println(array2[0]+" "+s[0]+" "+array[0]); 
    }
}
//evet array'de c ile aynı :))