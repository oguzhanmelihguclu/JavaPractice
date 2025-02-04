import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciBilgiSistemi {

    static Scanner scan = new Scanner(System.in);
    static String OgretmenKullanıcıNo = "123456";
    static String sifre = "1234";
    static ArrayList<String> ogrenciHavuzu = new ArrayList<>();

    public static void main(String[] args) {
        giris();

    }

    public static void giris() {
        System.out.println("==========>    WİSEQUARTER BOOT CAMP ÖĞRENCİ BİLGİ SİSTEMİNE HOŞGELDİNİZ     <==========");
        System.out.println("Lütfen giriş yapmak için kullanıcı numaranızı giriniz..");
        String ogrtmnKNo = scan.nextLine();
        System.out.println("Lütfen sifrenizi giriniz..");
        String Ksifre = scan.nextLine();

        if (ogrtmnKNo.equals(OgretmenKullanıcıNo) && Ksifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("Hatalı bilgi girişi yaptınız , Lütfen tekrar deneyiniz");
            giris();
        }
    }

    public static void menu() {
        System.out.println("==========>    MENÜYE KISMINDASINIZ     <==========");
        System.out.println("***LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ***");
        System.out.println("1-Öğrenci Ekle\n2-Öğrencileri Listele\n3-Öğrenci Güncelle\n4-Öğrenci Sil\n5-Çıkış Yap");

        int secim = scan.nextInt();
        if (secim >= 1 && secim <= 5) {
            switch (secim) {

                case 1: {
                    String girilenIsım = scan.nextLine();
                    ogrenciEkle(girilenIsım);
                    break;
                }
                case 2: {
                    ogrenciListele();
                    break;
                }
                case 3: {
                    String degistirilmekIstenen=scan.nextLine();
                    ogrenciGuncelle(degistirilmekIstenen);
                    break;
                }
                case 4: {
                    String silinecekNo= scan.nextLine();
                    ogrenciSil(silinecekNo);
                    break;
                }
                case 5: {
                    System.out.println("Çıkış yapılıyor");
                }


            }
        } else {
            System.out.println("Hatalı seçim yaptınız lütfen tekrar deneyiniz..");
            menu();
        }
    }
    public static void ogrenciEkle(String isim) {
        System.out.println("Eklemek istediğiniz Öğrenci bilgilerini giriniz, bitirmek için q ya basınız.");
        while (true) {
            System.out.print("Girilecek Öğrenci İsmini giriniz veya bitirmek için q tuslayınız: ");
            isim = scan.nextLine();
            if (isim.equalsIgnoreCase("q")) {
                System.out.println();
                menu();
                break;
            }
            ogrenciHavuzu.add(isim);
        }
    }
    public static void ogrenciListele() {
        System.out.println("=====>  GÜNCEL ÖĞRENCİ LİSESİ  <=====");
        if (ogrenciHavuzu.isEmpty()) {
            System.out.println("Henüz öğrenci girişi yapılmamıştır");
            menu();
        } else {
            int sayac = 0;
            int tsayac = 0;
            for (int i = 0; i < ogrenciHavuzu.size(); i++) {
                sayac++;
                System.out.println(sayac + "." + "Öğrenci İsmi=" + ogrenciHavuzu.get(i));
            }
            menu();
        }

    }
    public static void ogrenciGuncelle(String ListeNo){

        if (ogrenciHavuzu.isEmpty()) {
            System.out.println("Henüz öğrenci girişi yapılmamıştır ");
            menu();
        }
        else {

            System.out.println("Değiştirmek istediğiniz öğrencinin listedeki numarasını giriniz:");
            ListeNo=scan.nextLine();
            int listeNo1=Integer.parseInt(ListeNo);
            System.out.println("Değiştirmek istediğiniz öğrencinin yeni ismini giriniz :");
            String yeniİsim=scan.nextLine();

            ogrenciHavuzu.set(listeNo1-1,yeniİsim);
            int sayac = 0;
            for (int i = 0; i < ogrenciHavuzu.size(); i++) {
                sayac++;
                System.out.println(sayac + "." + "Öğrenci İsmi=" + ogrenciHavuzu.get(i));

            }
            menu();
        }
    }

    public static void ogrenciSil(String SilinecekListeNo){
        if (ogrenciHavuzu.isEmpty()) {
            System.out.println("Henüz öğrenci listesine isim girilmemistir");
            menu();
        }
        else {
            System.out.println("Silmek istediğiniz öğrencinin listedeki numarasını giriniz:");
            SilinecekListeNo = scan.nextLine();
            int listeNo1 = Integer.parseInt(SilinecekListeNo);
            ogrenciHavuzu.remove(listeNo1 - 1);
            int sayac = 0;
            for (int i = 0; i < ogrenciHavuzu.size(); i++) {
                sayac++;
                System.out.println(sayac + "." + "Öğrenci İsmi=" + ogrenciHavuzu.get(i));

            }
            menu();
        }

    }
}