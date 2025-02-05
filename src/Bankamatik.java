import java.util.Scanner;

public class Bankamatik {
    static Scanner scan = new Scanner(System.in);
    static String kartNo = "123456";
    static String sifre = "1234";
    static double bakiye = 30000;

    public static void main(String[] args) {

        /*
      ATM EKRANI VE ISLEMLER
 -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
    eger herhangi birini yanlis girerse tekrar girmesini isteyin.
 -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
 -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
 -Menu listesinde;
        Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
        islemleri olacaktır.
 -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
 -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
     eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
- Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
  */
        giris();
    }

    public static void giris() {
        System.out.println("----------GÜÇLÜ BANKASINA HOŞGELDİNİZ----------");
        System.out.println("****Güvenlik için şifrenizi kimseyle paylaşmayın*****!!");

        System.out.println("Kart numaranızı giriniz..");
        String KkartNo = scan.nextLine();

        System.out.println("Şifrenizi giriniz...");
        String Ksifre = scan.nextLine();

        KkartNo = KkartNo.replaceAll("//s", "");

        if (KkartNo.equals(kartNo) && Ksifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("Hatalı giris yaptınız , yeniden deneyiniz..");
            giris();
        }
    }

    public static void menu() {
        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");


        int secim = scan.nextInt();
        switch (secim) {

            case 1: {
                bakiyesorgulama();
                break;
            }
            case 2: {
                System.out.println("Yatiracaginiz para(TL) miktarini giriniz..");
                double miktar = scan.nextDouble();
                parayatirma(miktar);
                break;
            }
            case 3: {
                System.out.println("Çekmek istediğiniz para(TL) miktarini giriniz...");
                double cekme = scan.nextDouble();
                paracekme(cekme);
                break;
            }
            case 4: {
                paragonderme();
                break;
            }
            case 5: {
                sifredegistirme();
                break;
            }
            case 6: {
                System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz");
                System.exit(0);
            }
            default: {
                System.out.println("Seçiminiz yanlıştır , tekrar deneyiniz..");
                menu();
            }
        }

    }


    public static void sifredegistirme() {
        scan.nextLine();

        System.out.println("Mevcut şifrenizi giriniz..");
        String Ksifre = scan.nextLine();
        if (Ksifre.equals(sifre)) {
            System.out.println("Yeni şifrenizi giriniz.. :");
            String yeniSifre = scan.nextLine();
            System.out.println("Şifreniz güncellenmiştir..");
            menu();
        } else {
            System.out.println("Şifreniz eşleşmedi , tekrar deneyiniz");
            menu();
        }

    }

    public static void paragonderme() {
        scan.nextLine();
        System.out.println("Gönderilecek İban No sunu giriniz. Tr ile baslamalı ve 10 karakter uzunlugunda olmalıdır.");
        String Iban = scan.nextLine().toUpperCase().replaceAll("//s", "");

        if (Iban.startsWith("TR") && Iban.length() == 10) {
            System.out.println("Lütfen gönderilecek miktarı giriniz.. :");
            double gonderimMiktar = scan.nextDouble();
            if (gonderimMiktar <= bakiye) {
                bakiye -= gonderimMiktar;
                System.out.println("Para gönderme işleminiz başarı ile gerçekleşmiştir");
                bakiyesorgulama();
            } else {
                System.out.println("Girdiğiniz bilgi bakiyenizden fazladır, tekrar deneyiniz..");
            }
        } else {
            System.out.println("Girdiğiniz bilgiler kurallar ile uyuşmuyor , lütfen tekrar deneyiniz..");
            paragonderme();
        }


    }

    public static void paracekme(double cekme) {
        if (cekme <= bakiye) {
            bakiye -= cekme;
            bakiyesorgulama();
        } else {
            System.out.println("Çekim isteğiniz bakiyeden fazla oldugu icin işlem yapılamaz,tekrar deneyiniz");
            System.out.println("Yeniden çekmek istediğiniz miktarı giriniz..");
            paracekme(scan.nextDouble());
        }
    }

    public static void parayatirma(double miktar) {
        bakiye += miktar;
        bakiyesorgulama();
    }

    public static void bakiyesorgulama() {
        System.out.println("Bakiyeniz :" + bakiye + "TL");
        menu();
    }
}
