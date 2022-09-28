public class foreachString 
{
    public static void main(String[] Soylu)
    {
        String[] str0=new String[]{"kbu","bilgisayar","nuhendisligi"};
        String[][] str=new String[][]{{"necmiye","soylu"},{"cem","karaca"},{"ismail","abi"}};
        for(String a:str0)
            System.out.print(a+" ");

        System.out.println();

        for(String[] x:str)
            for(String y:x)
                System.out.print(y+" ");
    }    
}
