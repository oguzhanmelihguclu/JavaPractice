import java.time.LocalDateTime;
import java.util.Scanner;

public class GUCLUMARKET {
    static Scanner scan = new Scanner(System.in);
    static int urunKodu;
    static int urunFiyati;
    static boolean ekUrun;
    static String urunAdi;
    static int urunAdedi;
    static int toplam;
    static String sepet = "";

    public static void main(String[] args) {
        girisEkrani();
    }
    public static void girisEkrani() {
        System.out.println("------------------ GÜÇLÜ MARKETE HOŞGELDİNİZ------------------ ");
        System.out.println("-----------------------------Menü------------------------------");
        System.out.println("Lütfen alışveriş yapmak istediğiniz reyonu seçiniz.. \n1-Şarkuteri Reyonu \n2-Manav Reyonu\n3-Market Reyonu\n4-Alışverişiniz bittiyse fiş için \n5 Çıkış yapmak için");
        int secim = scan.nextInt();

        if (secim >= 1 && secim <= 5) {

            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
            }
        }
    }

    public static void sarkuteri() {
        System.out.println("--------------- ŞARKÜTERİ REYONUNA HOŞGELDİNİZ---------------");
        System.out.println("Lütfen şarkerü reyonundan almak istediğiniz ürünleri kodunu giriniz ve sepetinize ekleyeniz... " +
                "\n101-Peynir  200₺\n102-Kaymak  150₺\n103-Sucuk  300₺\n104-Pastırma  250₺\n105-Kavurma  275₺");

        while (!ekUrun) {

            urunKodu = scan.nextInt();

            if (urunKodu >= 101 && urunKodu <= 105) {
                System.out.println("Kaç paket alacaksınız?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {

                    case 101:
                        urunAdi = "Peynir";
                        urunFiyati = 200;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 102:
                        urunAdi = "Kaymak";
                        urunFiyati = 150;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 103:
                        urunAdi = "Sucuk";
                        urunFiyati = 300;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 104:
                        urunAdi = "Pastırma";
                        urunFiyati = 250;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 105:
                        urunAdi = "Kavurma";
                        urunFiyati = 275;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;


                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan toplam tutar: " + toplam + "₺");
                sepet += urunAdi + " :" + urunFiyati;
                System.out.println("Başka bir ürün almak için ürün kodunu giriniz\nAna menüye dönmek için 0 tuşuna basınız. ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun = false;
        }
    }

    public static void manav() {
        System.out.println("--------------- MANAV REYONUNA HOŞGELDİNİZ---------------");
        System.out.println("Lütfen manav reyonundan almak istediğiniz ürünleri kodunu giriniz ve sepetinize ekleyeniz... " +
                "\n201-Yerli Muz  59₺\n202-Portakal  49₺\n203-Elma  49₺\n204-Patates  35₺\n205-Soğan  25₺");

        while (!ekUrun) {

            urunKodu = scan.nextInt();

            if (urunKodu >= 201 && urunKodu <= 205) {
                System.out.println("Kaç paket alacaksınız?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {

                    case 201:
                        urunAdi = "Yerli Muz";
                        urunFiyati = 59;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 202:
                        urunAdi = "Portakal";
                        urunFiyati = 49;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 203:
                        urunAdi = "Elma";
                        urunFiyati = 49;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 204:
                        urunAdi = "Patates";
                        urunFiyati = 35;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 205:
                        urunAdi = "Soğan";
                        urunFiyati = 25;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;


                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan toplam tutar: " + toplam + "₺");
                sepet += urunAdi + " :" + urunFiyati;
                System.out.println("Başka bir ürün almak için ürün kodunu giriniz\nAna menüye dönmek için 0 tuşuna basınız. ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun = false;
        }
    }
    public static void market() {
        System.out.println("--------------- MANAV REYONUNA HOŞGELDİNİZ---------------");
        System.out.println("Lütfen manav reyonundan almak istediğiniz ürünleri kodunu giriniz ve sepetinize ekleyeniz... " +
                "\n301-Dubai Çikolatası  350₺\n302-Peçete  25₺\n303-5 Lt Su  30₺\n304-Nutella  180₺\n305-Tuvalet Kağıtı  189₺");

        while (!ekUrun) {

            urunKodu = scan.nextInt();

            if (urunKodu >= 301 && urunKodu <= 305) {
                System.out.println("Kaç paket alacaksınız?");
                urunAdedi = scan.nextInt();

                switch (urunKodu) {

                    case 301:
                        urunAdi = "Dubai Çikolatası";
                        urunFiyati = 350;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 302:
                        urunAdi = "Peçete";
                        urunFiyati = 25;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 303:
                        urunAdi = "Su";
                        urunFiyati = 30;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 304:
                        urunAdi = "Nutella";
                        urunFiyati = 180;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;
                    case 305:
                        urunAdi = "Tuvalet Kağıdı";
                        urunFiyati = 189;
                        System.out.println("Aldığınız " + urunAdedi + " adet " + urunAdi + " fiyatı : " + urunFiyati * urunAdedi);
                        break;


                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan toplam tutar: " + toplam + "₺");
                sepet += urunAdi + " :" + urunFiyati;
                System.out.println("Başka bir ürün almak için ürün kodunu giriniz\nAna menüye dönmek için 0 tuşuna basınız. ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
            ekUrun = false;
        }
    }

    public static void fisYazdir() {
        System.out.println("----------- Alışveriş Fişi ------------");
        System.out.println("             GÜÇLÜ MARKET               ");
        System.out.println("           İZMİR/GÜZELBAHÇE                ");
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



