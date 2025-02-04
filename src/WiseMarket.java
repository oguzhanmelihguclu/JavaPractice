import java.time.LocalDateTime;
import java.util.Scanner;

public class WiseMarket {
    static Scanner scan=new Scanner(System.in);
    static int urunKodu;
    static String urunAdi;
    static int urunfiyat;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun;
    static String sepet="";


/*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
public static void main(String[] args)  {
    girisEkrani();
}

    public static void girisEkrani() {
        System.out.println("============= WISE MARKET ===========");
        System.out.println("              Hoş geldiniz           ");
        System.out.println();
        System.out.println("Lütfen İşlem Seçimi Yapınız");
        System.out.println("------ Menü -------");
        System.out.println("1-Şarküteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fiş yazdır\n5-Çıkış");
        int secim=scan.nextInt();
        if (secim>=1 && secim<=5){
            switch (secim){
                case 1: sarkuteri(); break;
                case 2: manav(); break;
                case 3: market(); break;
                case 4: fisYazdir(); break;
                case 5: cikis(); break;
            }

            }else{
            System.out.println("Geçersiz bir seçim yaptınız");
            girisEkrani();
        }


    }

    public static void sarkuteri() {
        System.out.println("====== Şarküteri Reyonuna Hoşgeldiniz ======");
        System.out.println("Lütfen Satın almak istediğiniz ürün kodunu giriniz");
        System.out.println("------          Ürün Listesi          ------");
        System.out.println("101-Peynir  200₺\n102-Kaymak  150₺\n103-Sucuk  300₺\n104-Pastırma  250₺\n105-Kavurma  275₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 101 && urunKodu <= 105) {
                System.out.println(" Kaç Paket Alacaksınız?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 101:
                        urunAdi = "Peynir";
                        urunfiyat = 200;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 102:
                        urunAdi = "Kaymak";
                        urunfiyat = 150;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 103:
                        urunAdi = "Sucuk";
                        urunfiyat = 300;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 104:
                        urunAdi = "Pastırma";
                        urunfiyat = 250;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 105:
                        urunAdi = "Kavurma";
                        urunfiyat = 275;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                }
                urunfiyat = urunAdedi * urunfiyat;
                toplam += urunfiyat;
                System.out.println("Oluşan toplam tutar: " + toplam+ "₺");
                sepet+=urunAdi+" :"+urunfiyat;
                System.out.println("Başka bir ürün almak için ürün kodunu giriniz\nAna menüye dönmek için 0 tuşuna basınız. ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun=false;
        }

    }

    public static void manav() {
        System.out.println("====== Manav Reyonuna Hoşgeldiniz ======");
        System.out.println("Lütfen Satın almak istediğiniz ürün kodunu giriniz");
        System.out.println("------          Ürün Listesi          ------");
        System.out.println("201-Yerli Muz  59₺\n202-Portakal  49₺\n203-Elma  49₺\n204-Patates  35₺\n205-Soğan  25₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 201 && urunKodu <= 205) {
                System.out.println(" Kaç kg Alacaksınız?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 201:
                        urunAdi = "Yerli Muz";
                        urunfiyat = 59;
                        System.out.println(urunAdedi + "kg " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 202:
                        urunAdi = "Portakal";
                        urunfiyat = 49;
                        System.out.println(urunAdedi + "kg " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 203:
                        urunAdi = "Elma";
                        urunfiyat = 39;
                        System.out.println(urunAdedi + "kg " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 104:
                        urunAdi = "Patates";
                        urunfiyat = 35;
                        System.out.println(urunAdedi + "kg " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 105:
                        urunAdi = "Soğan";
                        urunfiyat = 25;
                        System.out.println(urunAdedi + "kg " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                }
                urunfiyat = urunAdedi * urunfiyat;
                toplam += urunfiyat;
                System.out.println("Oluşan toplam tutar: " + toplam+ "₺");
                sepet+=urunAdi+" :"+urunfiyat;
                System.out.println("Başka bir ürün almak için ürün kodunu giriniz\nAna menüye dönmek için 0 tuşuna basınız. ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun=false;
        }
    }

    public static void market() {
        System.out.println("====== Market Reyonuna Hoşgeldiniz ======");
        System.out.println("Lütfen Satın almak istediğiniz ürün kodunu giriniz");
        System.out.println("------          Ürün Listesi          ------");
        System.out.println("301-Dubai Çikolatası  350₺\n302-Peçete  25₺\n303-5 Lt Su  30₺\n304-Nutella  180₺\n305-Tuvalet Kağıtı  189₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 301 && urunKodu <= 305) {
                System.out.println(" Kaç Paket Alacaksınız?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 301:
                        urunAdi = "Dubai çikolatası";
                        urunfiyat = 350;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 302:
                        urunAdi = "Peçete";
                        urunfiyat = 25;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 303:
                        urunAdi = "5 Lt Su";
                        urunfiyat = 30;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 304:
                        urunAdi = "Nutella";
                        urunfiyat = 180;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                    case 105:
                        urunAdi = "Tuvalet Kağıdı";
                        urunfiyat = 189;
                        System.out.println(urunAdedi + "paket " + urunAdi + " fiyatı: " + (urunfiyat * urunAdedi)+ "₺");
                        break;
                }
                urunfiyat = urunAdedi * urunfiyat;
                toplam += urunfiyat;
                System.out.println("Oluşan toplam tutar: " + toplam+ "₺");
                sepet+=urunAdi+" :"+urunfiyat;
                System.out.println("Başka bir ürün almak için ürün kodunu giriniz\nAna menüye dönmek için 0 tuşuna basınız. ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun=false;
        }
    }

    public static void fisYazdir() {
        System.out.println("----------- Alışveriş Fişi ------------");
        System.out.println("             WISE MARKET               ");
        System.out.println("               New York                ");
        System.out.println();
        System.out.println(sepet);
        System.out.println("Toplam Tutar: "+toplam);
        System.out.println("KDV %8: "+toplam*0.08);
        toplam+=toplam*0.08;
        System.out.println("Ödenecek Tutar: "+toplam);
        System.out.print("Ödenen Tutar: ");
        int odenen= scan.nextInt();
        if (odenen<toplam){
            System.out.println("Ödenen tutar yeterli değil."+(toplam-odenen)+" kadar daha ödeme yapmalısınız");
            fisYazdir();
        }else {
            System.out.println("Para üstü: "+(odenen-toplam));
        }
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
        LocalDateTime time=LocalDateTime.now();
        System.out.println(time);
        cikis();


    }

    public static void cikis() {
        System.out.print("\n\n\nÇıkış Yapılıyor  ");

        scan.close(); // Giriş yapmak için açılan tarayıcı kapatılır
        System.exit(0); // çalışan Kodu durdurur. Bu satırdan sonrası çalışmaz
    }


}
