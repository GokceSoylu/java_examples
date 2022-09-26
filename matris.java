import java.util.Scanner;

public class matris//hızımı alamadım fonk attım :))
{
    static void print(int[][]m, int a)
    {
        int i, j;
        System.out.printf("%nmatris%d%n",a);
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
                System.out.printf("%d ",m[i][j]);
            System.out.printf("%n");
        }
    }
    public static void main(String[] args)
    {
        int row,column;
        Scanner in=new Scanner(System.in);
        System.out.println("row ");
        row=in.nextInt();
        System.out.printf("column ");
        column=in.nextInt();
        
        //! int matris[2][2]; wrong
        int matris1[][]={{1,2},{3,4}};
        int matris2[][]=new int[2][2];
        int matris3[][]=new int[row][column];
        
        int[][] matris4=new int[2][2];
         
        int matris5[][];
        matris5=new int [2][2];

        int i, j;
        for(i=0;i<2;i++)
            for(j=0;j<2;j++)
            {
                matris2[i][j]=2*(i*2+j+1);
                matris3[i][j]=3*matris1[i][j];
                matris4[i][j]=2*matris2[i][j];
            }    
       print(matris1,1);
       print(matris2,2);
       print(matris3,3);
       print(matris4,4);
       print(matris5,5);
       in.close();
    }
}//sanırımm syntax anlaşılır oldu. Dikkat edeceğimiz new kullandığımız yerde initializing yapamayız 
//c'den net farkı 
//  *)int a[2][2]; şklinde tanımlama yapamayız!
//  *)new malloc gibi olduğu için new ile yer alarak değişken size/ı kadar yer alınabilir int a=2, b=3; int m[][]=new in[a][b];
//  *)int[][]m; şeklinde pekte gözümüzün alışkın olmadığı bir tanımlama doğru :)) ki anladığım kadarıyla yaygın olanda bu :)
 