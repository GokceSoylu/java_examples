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
bunun üzerinde durmayacağım for, while, do while, break, continue, switch hatta if else C'dekinin aynısı syntax 'da dahil olmak üzere hiçbir fark yok. [örnek](https://github.com/NecmiyeSoylu/java_examples/blob/master/loops.java) [örnek](https://github.com/NecmiyeSoylu/java_examples/blob/master/loops2.java)

### Diziler
degisken_tipi [] dizi_adı; şeklinde oluşturulur. Her değişken tipinde oluşturulabilir. dizi mantığı kullanımı, C ile aynı sadece initialing kısmında bir farklılık var. 
                int[] a;// dikkat edelim [indis değeri yazmadık]
                int[] a={1,2,3};
                int[] a=new int[2];// new kullanırken boyut belirttik
                int[] a=new int[]{1,2,3};// initialize edeceksek new kullansakta boyut yazmadık
Şahsen aklımda şöyle kalıyor initilize edeceğimiz yerde java ben zaten kaç tane olduğunu görüyorum daha niye yazıyosun diyor :)) int a[]; yazımıda doğrudur. hata almayız. özellikleri C'deki ile aynı. sadece  char dizisinde ufak farklılıklar var.
C'de string diye bir değişken tipi yoktu. O yüzden Char dizisi aynı zamanda string olarak kullanılıyordu. Char dizisi hem kendi özelliklerine hem string'in özelliklerine sahipti diyebşliriz. Java'da ise String özelliklerine String sahiptir. char dizisi isse sadece char dizisine ait özelliklere sahip, stringin özelliklerini taşımaz. 

- char a[]="soylu"; yanlış "" bu tırnak string için kullanılır
- char a[]='soylu'; yanlış çünkü uzun. Tek karakter olmalı
- char a[]={'s','o','y','l','u'}; doğru :)) işte böyle yola gel 😁
Yazdırmaya alakalıda bize kolaylık sağlaycak bir fonksiyonıumuz var *length* 
                public class array_length 
                {
                    public static void main(String[] Soylu)
                    {
                        int a[]=new int[]{1,2,3,4,5};
                        for(int i=0;i < a.length;i++)
                            System.out.print(a[i]+" ");
                    }    
                }

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
                    int[][] matris4=new int[][]{{1,2},{3,4}};
                    int[][] matris5;
                    
                    matris5=new int [3][3];
                }
                //sanırımm syntax anlaşılır oldu. Dikkat edeceğimiz new kullandığımız yerde initializing yapacaksak boyut yazmayız
                // c'den net farkı 
                //  *)int a[2][2]; şklinde tanımlama yapamayız!
                //  *)new malloc gibi olduğu için new ile yer değişken  kadar yer alınabilir. 
                //  *)int[][] m; şeklinde pekte gözümüzün alışkın olmadığı bir tanımlama doğru :)) ki anladığım kadarıyla yaygın olanda bu :)
C'de atama yapmazsak rastgele sayılar atar. Ancak Java'da atma yapmadığımızda 0 atar. *length* fonksiyonunu burada da kullanabiliriz
                public class arrayLength 
                {
                    public static void main(String[] Soylu)
                    {
                        int[][] aa={{1,2},{3,4}};
                        
                        for(int i=0;i<aa.length;i++) 
                                for(int j=0;j<aa[0].length;j++)
                                    System.out.print(aa[i][j]+" ");
                    }    
                }//dikkat edelim aa.length bize satır sayısını, aa[0].length bize sutun sayısını verir.

### String 
Geldi gönlümün efendisi :) 
C'de normal string yapacağımız zaman char[] yapıyorduk. char str[]="necmiye"; gibi. Bu sabit oluyordu ve daha sonra değiştirilemiyordu. İstediğimiz zaman %s ile direkt yazdırabiliyor yada istediğimiz elemana str [2] diyerek ulaşbiliyorduk. ayrıca 2 elmanlı bir char dizisi değimiz zaman hem char a[2]=('n','s'); hem char a[2]=("necmiye","soylu"); mümkündü. 
Burada ise String tanımladığımız zaman en önemli farkı isteğimiz zaman değiştirebiliyor, atamayı istediğimiz zaman yapabiliyoruz.[örenk](https://github.com/NecmiyeSoylu/java_examples/blob/master/initialize_.java) [örnek2](https://github.com/NecmiyeSoylu/java_examples/blob/master/stringArray.java)ikinci örnek daha iyi :))
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
Stringin tek bir elamanına ulaşmak istersiek charAt() fonksiyonunu kullanırız. paremetre olarak ulaşmak istediğimiz elmanın indexini göndeririz. orneğin tek bir elemanını yazdırmak için System.out.println(str1.charAt(0)); şeklinde yazabiliriz.
CharAt() fonkisiyonu bizden indexi alır ve ulaştığı char'ı döndürür. bu yüzden bu fonksiyonla Stringin  belirli bir elemanını değiştiremeyiz. Bunun için dolaylı yöntemler kullanıcaz. setCharAt(index,'yeni_karakter') fonksiyonu bunlardan biri. ancak bu fonksiyon StringBuilder tipinde kullanılabilir. O zaman bu tipte yeni bir string oluturur sonra stringini buna atar ve değiştirirsin. aşşağıdaki öreneği incelerseniz daha net olur.
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
uzatma yahu direkt str=str2; yap dersen, malesef tipleri farklı olduğu için bu şekilde bir atama yapamıyoruz. boyle new kullanarak dolaylı yoldan kopyalıyoruz :))
gelelim string dizisine. ops! string zaten dizi değil miydi?😳 Hayır dostum değil. string bir değişken tipi. Zaten bu yüzden tek bir karaketerine ulaşmak istediğimizde karnımız çatlıyo. Bak, şimdi string dizisinin bir elmanına ulaşırken hiç sorun yaşamıyıcaz çünkü normal bir dizi :))
                public static void main(String[] Soylu)
                {
                    String[] dizi={"atama","sekli"};
                    String[] dizi2={dizi[1],dizi[0]};
                    String[] dizi3;
                        
                    //String[2] dizi; hatalı olur parnetezlerin içine boyut blirtmiyoruz :))
                    //String dizi[]={"atama","sekli"}; bu yazımda hata almazsın. ancak genelde yazım yukarıdaki gibi:))
                
                    dizi2[1]="ata"; //değiştirdim işte :))
                }    
nasıl yazdırıcaz dersen C'de yaptığımız gibi döngüye sokup elemanları tek tek yazdırabilirsin. Yada *Arrays.toString()* fonksiyonunu kullanabilirsin. ancak direkt print(str) şeklinde yazdıramzsın. İnceleyelim.
                import java.util.Arrays; // fonksiyon için kütüphanemizi dahil ediyoruz :))
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
Çok boyutlu String dizi. String[][] str; şeklinde oluşturulur. Yine parantezlerin içine sayı yazılmaz. 
String[][] str={{"necmiye",soylu"},{"kbu","mühendislik"},{"bligisayar","mühendisligi"}}; şeklinde initilize edebililriz. yazdırmaya gelince *deepToString()* fonksiyonunu kullanıcaz
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
şşş sakince [örneğe](https://github.com/NecmiyeSoylu/java_examples/blob/master/tryForString.java) tıklayınız. 

### Fonksiyonlar
C'deki fonksiyonları biliyorsun. Burada da aynı *return_tipi Fonksiyon_adi(paremetre_listesi)* bu tipi yine kullanıyoruz bunaek olarak. Dikkat edersen main'in başına static yazmıştık, bir metodun da mainden çağırılabilmesi için static olması gerekiyor. (başına static yazıyoruz yani :)) Birde erişim belirteçleri var. yine main üzerinden bakacak olursak public static void main diyoruz buaraki public erişim belirtecidir. Diğer sınıflardan da erişilebilir olduğunu gösterir. metodlarını yazarklen bunu belirtmek zorunda değilsin bu aşamada bu önemli değil. oop kısmına geçince bundan detaylı bahsederiz.
                public static void main()
                {
                    int a=10, b=20, c;s
                    c=addition(a,b);
                }
                static int addition(int x, int y)
                {
                    return x+y;
                }
bir şey dikkatini çekti mi. prototype yazmadık😳. java'da ister  main'den önce olsun ister sonra prototype yazmaya gerek yok :))

C++'tan hatırladığımız bir overloading olayı vardı burada da yapalım mı? Öncelikle nedir bu overloading?
aynı isimli fakat farklı paremetre listeli fonksiyonlar yazabiliyoruz. öreneğin
                static int addition(int a, int b)
                {
                    return a+b
                }
                static float addition(float a, float b)
                {
                    return a+b;
                }
                public static void main(String[] arg)
                {
                    int z=10, t=20;
                    float m=7,8, n=9.7;
                    z=addition()
                }//afilli 💃🏻
peki ya bunu nasıl yapıyor? 
Derleyici her fonksiyon iiçn önce *__Z* ifadesini koyar sonra fonksiyonun harf sayısını koyar yukarısı için addition 8 harf *__Z8* olur. daha sonra paremetre listesine bakar. int ,int o zaman *Z__8ii* olur. Bu sayede isimleri aynı ama parametre sayıları yada tipleri farklı olan fonksiyonlar ayırt edilebilir :).
Gördüğün gibi return tipine bakılmaz. Bunsdan dolayı isimleri ve paremetre listeleri aynı fakat retuern tipleri farlı olan fonksiyonlar ayırt edilemez. çok ta yüklenmeyelim :)) 
Peki ya default paremeter ? Malesef Java'da default paremetre yazamayız.

call by refarence aynı. Değişkeni direkt gönderirsen kopyalar. değişken üzerinde kalıcı değişiklik yapamaz. Call by refaranceye gelince pointer... java'da pointer yok!😳 
call by refarance yapmak için dizinin direkt ismiyle gönderebiliriz. yada aynı class içindeyse fonksiyon direkt değişkenşn kendisine ulaşabiliyor ya öyle değiştirebiliriz. Yani burada pointer mantığını kullanamayız OOP yeteneğini konuştur diyor :)
[örenk](https://github.com/NecmiyeSoylu/java_examples/blob/master/callByRefarence.java)

kolay geldi galiba biraz :) o zaman beyinleri yakalım🔥 konumuz generic metod. Normalde generic class falan daha çok oop kısmında kullanıcaz ancak burada da bir giriş yapalım.
tipsiz fonksiyon oluşturucaz. yukarıda farklı tipte paremetrelere sahip fonksiyonlar yazdık burada ise kod partı ismi her şeyi aynı sadece paremetrelerin/retur'un tipi farklı olan metod yazmak istiyoruz. yahu adamların her şeyi aynı bir tek tip farklı bunun için farklı farklı fonksiyonlar mı yazalım? hayır yazmayalıımm:)) <> bu şekil ile tipini bizim belirleyeceğimiz metodlar yazılabliriz
                public class genericMethod 
                {
                    public static void main(String[] Soylu)
                    {
                        char x='A';
                        function(x);
                    }    
                    static < T > void function(T t)
                    {
                        System.out.print("the element is "+ t);
                    }
                }   
< T > ifadesi değiştirilebilir T yerine başka bir şey de yazılabilirdi. buradaki örnekleri inceleyelim list kısmında biraz daha değiniyoruz. 
                public class genericMethod2 
                {
                    public static void main(String[] Soylu)
                    {
                        int a=10, b=20;
                        System.out.print(fonk(a,b));
                    }    
                    static < tipsiz > tipsiz fonk(tipsiz x, tipsiz y)
                    {
                        x=y;
                        return x;
                    }
                }
burada < tipsiz > diye bir genel tip belirledik. Fonksiyonda bu tipin kullanılacağını belirtmek için static'ten önce bunu yazdık   C++'da < template > yazıyorduk ya o mantık. sonra normla int der gibi bu değişken tipini rahatlıla kullandık. < tipsiz > dediğimizde belli bir tip yoktu. biz bu fonksiyona int gönderdiğimizde artık o tipsiz den kasıt int oldu ve ona göre işleme devam etti. C++'taki template'den biraz farklı. C++'da template tipindeki değişkenlerle işlem yapabiliyordu. burada ise tipin n eolduğu belli olmadığı işlem yapamazsın diyor. Sadece aynı tipteki başka değişkene atama yapabliyoruz. işte buda daha çok class ve list kullanımı için. 
                public class genericMethod3 
                {
                    static < generic, generic2 > void fonk(generic a, generic2 b)
                    {
                        System.out.println(a);
                        System.out.print(b);
                    }    
                    public static void main(String[] Soylu)
                    {
                        int a=10;
                        String n="number";
                        fonk(a,n);
                    }
                }

### Liste

