public class stringDizisi 
{
    public static void main(String[] Soylu)
    {
        String[] dizi={"atama","sekli"};
        String[] dizi2={dizi[1],dizi[0]};
        String[] dizi3;
        
        //String[2] dizi; hatalı olur parnetezlerin içine boyut blirtmiyoruz :))
        //String dizi[]={"atama","sekli"}; bu yazımda hata almazsın. ancak genelde yazım yukarıdaki gibi:))

        dizi2[1]="ata"; //değiştirdim işte :))
    }    
}
