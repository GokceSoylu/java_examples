# Java Temel Yazım Kuralları

### Giriş
                public class first
                {
                    public static void main(String[] args)
                    {
                        
                    }
                }

Genel yazım yukarıdaki gibidir.  "First" benim koyduğum isim bunu değiştirebiliriz. Önemli bir ayrıntı projenin adı ve sınıfın adı aynı aynı olmak zorunda.  yai bu kod partı için proje ismim first.java .   C deki main fonksiyonun olması gibi burada da main method bulunur. (method ve fonksiyon aynı şey. Java'da fonksiyonlara method diyeceğiz). kod derlenmeye main metotdan başlanır. Ve main method bulunması zorunludur. "public static void" kısmında değişiklik yapmayız. main fonksiyon public ve static olmak zorundadır. arg kısmına gelince buaraya istediğin şeyi yazabilirsin. istersen mahmut yaz :)
zaten viod yazmamızdan anlayacağın gibi main'de return'e ihtiyacımız yok. 

### Yazdırma
ekrana yazdırmak için kullanabileceğimiz üç farklı method var. print, println ve printf bunların syntax'ı 
System.out.print() System.out.println()  System.out.printf() şeklindedir. evet gerçekten boyle uzun uzun yazılıyor :))
bunlardan printf normal C deki printf ile aynı. tek bir farkı var \n \t gibi ifadeleri % ile yazdiriyoruz. %n %t şeklinde :))
                public class printf_
                {
                    public static void main(String[] args)
                    {
                        System.out.printf("%s%n%s","Necmiye","SOYLU");
                    } 
                }
print ise c++'daki cout'a benziyor. >> yerine + kullanıyor sadece :). println ise yazdırma iişelmi bittikten sonra bir sonraki satıra geçiyor.
                public class println_ 
                {
                    public static void main(String[] args)
                    {

                        int a=10,b=20;
                        System.out.println(a+b);
                        System.out.println("the answer "+a+b);  //string gibi degerleri yan yana yazdırıyor
                        System.out.println("the answer "+(a+b));    //parantez içinin işlemğini yapıp yazdırıyor
                        System.out.println("the aswer "+a*b);   // * + dan öncelikli --> ez cümle işlem önceliğine vardır
                        //! System.out.println("the answer "+a-b); hata verir çünkü - ve + işlem önceliği yok. Soldan yazdırmaya
                        //baslar string yazar a'yı  ekleyecek ama -  ifdesini tanımaz. 
                        System.out.println("the answer "+(a-b));
                        System.out.println("the answer "+a/b);//tam bolme
                        System.out.println("the answer "+(float)a/b);//ondaklıklı bolme
                        System.out.println("the anwer "+(float)(a/b));//sonucu float yaptı, float bolmedi :))
                    }    
                }
                /*  output
                *  the aswer 1020
                *  the aswer 30
                *  the answer 200
                *  the aswer -10
                *  the aswer 0
                *  the aswer 0.5
                *  the answer 0.0
                */

### İnput
Bu biraz değişik. Scanner sınıfından bir nesne oluşturup, bu nesne sayesinde input metodlarına ulaşıyoruz. 
                public static void main(String[] args)
                {
                    int a;
                    Scanner in=new Scanner(System.in);
                    a=in.nextInt();
                }
nesneyi oluşturma kısmı sabit. Scanner obje_adı = new Scanner(System.in) bu şekilde input almamızı sağlayacak nesnemizi oluşruruz daha sonra alacağımız veri tipine göre nesne kullanırız.

int nextInt()
float nextFloat()
double nextDouble()
String nextLine()
Char nextLine().charAt(0);

Genel mantık bu şkeilde. charAt() fonksiyonununa gelince buarada paremetre olarak index sayısı alır. cahrAt(index_sayısı). normalde burada char dizisinin belli bir indexteki elemanına ulaşmak için kullanırız burada ise tek bir cahr alacağımız için 0 yazarız(cahrAt() vb cahr ve string ile ilgili kısımlara yazının devaminda değiniyorum). birde bu nesne ile işmiz bittiğinde close()fonksiyonu ile kapatmamız gerekir. Pekiştirmek için [örnek](https://github.com/NecmiyeSoylu/java_examples/blob/master/input.java)

### Değişken Tipleri
tipik char, int, float, double, char var. C'den farklı olarak boolean ve String var. boolean c++'dakı bool. true, false iki şekilde olabiliyor. String ise adı üstünde string oluşturmamız sağlıyor. boyle ayrı bir değişken tipinin olması bize C'den farklı ozellikler kazandırıyor. String herhangi bir fonksiyon kullanılmadan değiştiribiliyor. ancak char dizisini string gibi kullanamıyoruz vb. buna string başlılığı altında detaylı değiniyorum. değişken tipler [örenk](https://github.com/NecmiyeSoylu/java_examples/blob/master/veriTipleri.java)

### Döngüler
bunun üzerinde durmeyeacağım for, while, do while, break. continue, switch hatta if else C'dekinin aynısı syntax 'ta dahil olmak üzere hiçbir fark yok. [örnek](https://github.com/NecmiyeSoylu/java_examples/blob/master/loops.java) [örnek](https://github.com/NecmiyeSoylu/java_examples/blob/master/loops2.java)

### Diziler
C'de olduğu her tipten dizi oluşturabiliriz. yine [] parantezini kullanırız C'den farklı olarak []'in içine boyutu yazmayız:)

int[] a;
float[] b;
char[] c; 

gibi. int a[]; yazımıda doğrudur. hata almayız. özellikleri C'deki ile aynı. sadece char dis
disinde farklılık var.C'de string diye bir değişken tipi yoktu. O yüzden Char dizisi aynı zamanda string olaark kullanılıyordu. Char dizisi hem kendi özelliklerine hem string'in özelliklerine sahşpti diyebşliriz. Java'da ise String özelliklerine String sahiptir. char dizisi isse sadece char dizisine ait özelliklere sahip, stringin özelliklerini taşımaz. 

- char a[]="soylu"; yanlış "" bu tırnak string için kullanılır
- char a[]='soylu'; yanlış çünkü uzun tek karakter olmalı
- char a[]={'s','o','y','l','u'}; doğru :)) işte böyle yola gel 😁

Çok boyutlu dizilere gelirsek. Burasıda aynı.
int[][] aa;
float[][] aa;
char[][] aa;
                public static void main(String[] args)
                {
                    int row,column;
                    Scanner in=new Scanner(System.in);
                    row=in.nextInt();
                    column=in.nextInt();
                        
                    //! int matris[2][2]; wrong
                    int[][] matris1={{1,2},{3,4}};
                    int[][] matris2=new int[2][2];
                    int[][] matris3=new int[row][column]; 
                    int[][] matris5;
                    matris5=new int [3][3];
                }
                //sanırımm syntax anlaşılır oldu. Dikkat edeceğimiz new kullandığımız yerde initializing yapamayız 
                // c'den net farkı 
                //  *)int a[2][2]; şklinde tanımlama yapamayız!
                //  *)new malloc gibi olduğu için new ile yer alarak değişken size/ı kadar yer alınabilir. 
                //  *)int[][]m; şeklinde pekte gözümüzün alışkın olmadığı bir tanımlama doğru :)) ki anladığım kadarıyla yaygın olanda bu :)

### String 
Geldi gönlümün efendisi :) 
C'de normal string yapacağımız zaman char[] yapıyorduk. char str[]="necmiye"; gibi. Bu sabit oluyordu ve daha sonra değiştirileiyordu. İstediğimiz zaman %s ile direkt yazdırabiliyor yada istediğimiz elemana str[2] diyerek ulaşbiliyorduk. ayrıca elmanlı bir char dizisi değimiz zaman hem char a[2]=('n','s'); hem char a[2]=("necmiye","soylu"); mümkündü. 
Burada ise String tanımladığımız zaman en önemli farkı isteğimiz zaman değiştirebiliyor. atamayı istediğimiz zaman yapabiliyoruz.[örenk](https://github.com/NecmiyeSoylu/java_examples/blob/master/initialize_.java) [örnek2](https://github.com/NecmiyeSoylu/java_examples/blob/master/stringArray.java)ikinci örnek daha iyi :))
                public class initialize_
                {
                    public static void main(String[] args)
                    {
                        String str1="Necmiye";
                        String str2=new String("Soylu");
                        String str3=new String(str1);
                        String str4;
                        String str5;

                        str4="necmiye soylu";
                        str5=str4;

                        str1="KBU";
                    }
                }//aklıma gelen tüm atama şekillerini yazdım :)) 
Stringin tek bir elamanına ulaşmak istersiek charAt() fonksiyonunu kullanırız. paremetre olarak ulaşmak istediğimiz elmanın indexini göndeririz. orneğin tek bir elemanını yazdırmak için System.out.println(str1.charAt(0)); CharAt() fonkisiyonu bizden indexi alır ve ulaştığı char'ı dödürür. bu yüzden bu fonksiyonla Stringin bir belirli elemanını değiştiremeyiz. Bunun için dolaylı yöntemler kullanıcaz. setCharAt(index,'yeni_karakter') fonksiyonu. ancak bu fonksiyon StringBuilder tipinde kullanılabilir. o zaman bu tipte yeni bir string oluturur sonra stringini buna atar ve değiştirirsin. aşşağıda incelerseniz daha net olur.
                public class string_eleman 
                {
                    public static void main(String[] args)
                    {
                        String str="kbu";
                        StringBuilder str2=new StringBuilder(str);
                        str2.setCharAt(1,'t');
                        System.out.println(str2);
                        String str_new=new String(str2);
                        str=str_new;
                    }   
                }
uzatma yahu direkt str=str2; yap dersen, malesef tipleri farklı olduğu bu şekilde bir atama yapamıyoruz. bole new kullanarak dolaylı yoldan kopyalıyoruz :))
gelelim string dizisine. ops! string zaten dizi değil miydi?😳 hayır dostum değil. string bir değişken tipi bu yüzden tek bir elemanına ulaşırken karnımız çatlıyo. bak şimdi string dizisinin bir elmanına ulaşırken hiç sorun yaşamıyıcaz çünkü normal bir dizi :))
                public static void main(String[] Soylu)
                {
                    String[] dizi={"atama","sekli"};
                    String[] dizi2={dizi[1],dizi[0]};
                    String[] dizi3;
                        
                    //String[2] dizi; hatalı olur parnetezlerin içine boyut blirtmiyoruz :))
                    //String dizi[]={"atama","sekli"}; bu yazımda hata almazsın. ancak genelde yazım yukarıdaki gibi:))
                
                    dizi2[1]="ata"; //değiştirdim işte :))
                }    
nasıl yazdırıcaz dersen C'de yaptığımız gibi döngüye sokup elemanları tek tek yazdırabilirsin. yada Arrays.toString() fonksiyonunu kullanabilirsin. ancak direkt print(str) şeklinde yazdıramzsın. inceleyelim
                import java.util.Arrays;// fonksiyon için kütüphanemizi dahil ediyoruz :))
                public class stringPrint 
                {
                    public static void main(String[] Soylu)
                    {
                        int i;
                        String[] str={"necmiye","soylu","kbu"};
                        for(i=0;i<3;i++)
                            System.out.print(str[i]+"  ");
                        System.out.println(str); //buarada dizinin içeriğini yazdıramayız
                        System.out.println(Arrays.toString(str));

                    }    
                }
                /* Output 
                * necmiye  soylu  kbu  
                * [Ljava.lang.String;@251a69d7
                * [necmiye, soylu, kbu]
                */  
çok boyutlu String dizi. String[][] str; şeklinde oluşturulur. Yine parantezlerin içine sayı yazılmaz. 
String[][] str={{"necmiye",soylu"},{"kbu","mühendislik"},{"bligisayar","mühendisligi"}}; şeklinde initilize edebililriz. yazdırmaya gelince deepToString() fonksiyonunu kullanıcaz
                import java.util.Arrays;
                public class stringPrintMulti 
                {
                    public static void main(String[] Soylu)
                    {
                        String str[][]={{"necmiye","soylu"},{"kbu","muhendislik"},{"bilgisayar","mühendislik"}};
                        System.out.println(Arrays.deepToString(str));
                    }    
                }
                /* Output
                * [[necmiye, soylu], [kbu, muhendislik], [bilgisayar, mühendislik]]
                */