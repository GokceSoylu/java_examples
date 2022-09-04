public class loops2 
{
    public static void main(String[] args)
    {
        int i, number, digit;
        for(i=100;i<200;i++)
        {
            number=i;
            digit=0;
            while(true)
            {
                if(number==0) break;
                digit+=number%10;
                number=number/10;
            }
            if(digit%2!=0)  continue;
            System.out.println(digit);
        }
    }    
}//görüldüğü üzere break ve continue komutlarının hem mantığı hem syntax'ı c ile aynı
