//! Aman Allah'ım pointer yok!  
// o zaman nasıl call by referance yapıcaz? Yapamayacağğız. Dağılalım.
// anladığım kadarıyla dolaylı yoldan ulaşıcaz. işte aynı class'ın içine al, fonksiyonlarla faln dolaylı yoldan ulaş gibi gibi :))
//burada tamamen oop yeteğin konuşacak yani :))
public class callByRefarence 
{
    static int x=10;
    static void function()
    {
        x+=10;
    }
    public static void main(String[] Soylu)
    {
        System.out.println(x);
        function();
        System.out.println(x);
    }     
}
