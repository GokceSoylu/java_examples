public class loops //döngü yapıları c ile aynı
{
    public static void main(String[] args)
    {
        int i, number, sum;
        System.out.println(1%10);
        for(i=10;i<20;i++)
        {
            sum=0;
            number=i;
            while(number>0)
            {
                sum+=number%10;
                number=number/10;
            }    
            System.out.println(sum);  
        }
    }
}// do while ornwği yazmadım onun syntax'ıda c ve c++ ile aynı 
