public class charArray 
{
    public static void main(String [] args)
    {
        //char a[]={"necmiye"}; çift tırnak stribg demektir. Char tanımlama kullanılamaz
        char ar[]={'a','b','c'};
        char arr[][]={{'a','b'},{'c','d'}};
        char arra[][]=new char[2][2];
        char [][]array;
        array=new char[2][2];
        //arra={'a','b','c','c'}; const sonradan initiaize olmaz!

        for(char c:ar)// çok değil mi-> ancak şuna dikkat edelim char tanımlaması burada yapılmalı.
            System.out.println(c);  
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                System.out.printf("%c ",arr[i][j]);
            System.out.printf("%n");
        }   
        System.out.printf("%narray");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.printf("->%c ",arra[i][j]);
                System.out.printf("y->%c ",array[i][j]);
            }    
            System.out.printf("%n");
        }   
                  
    }// char array boyle      
}
//*  Java'da char array kullanmak biraz sıkıntılı. string olduğu için char array çok kısıtlı kullanmıma sahip. C 'de char
//*  char array'i string oluşturmak için kullanıyorduk. Ancak java'da boyle yapamayız char array ile string olusturamayız. 
//*  char array string dönüşümü yapabiliriz ona da değineceğim.
//*  c++ 'da ise string tipi olmasına rağmen char array ile string oluşturabiliriz tıpkı C gibi sorun olmaz :))
//*  atama yapmadığın durumlarda da içerisi boş olur c gibi rastgele atama yapma z:)