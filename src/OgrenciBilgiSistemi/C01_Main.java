package OgrenciBilgiSistemi;

import java.util.Scanner;

public class C01_Main {
    public static void main(String[] args) {

        C03_OgrenciYonetimSistemi oys =new C03_OgrenciYonetimSistemi();
        Scanner scan=new Scanner(System.in);

        System.out.println("        ÖĞRENCİ BİLGİ SİSTEMİNE HOŞGELDİNİZ         ");
        System.out.println("Yapmak istediğiniz işlemi seçiniz...");

        while (true) {

            System.out.println("1==> Öğrenci Ekle");
            System.out.println("2==> Öğrenci Listele");
            System.out.println("3==> Öğrenci Güncelle");
            System.out.println("4==> Öğrenci Sil");
            System.out.println("5==> Çıkış Yap");
            System.out.println("Seçimiz.. :");
            int secim=scan.nextInt();
            boolean cıkısYapılacakMı=false;
            scan.nextLine();

            switch (secim) {

                case 1 :
                    System.out.println("Eklenecek Öğrenci Adı :");
                    String isim =scan.nextLine();
                    System.out.println("Öğrencinin Mail Adresi :");
                    String email=scan.nextLine();
                    oys.ogrenciEkleme(isim,email);
                    break;
                case 2:
                    oys.ogrencileriListele();
                    break;
                case 3:
                    System.out.println("Güncellenecek öğrenci ID :");
                    int guncellenenId= scan.nextInt();
                    scan.nextLine();
                    System.out.println("Güncellenen yeni isim :");
                    String yeniIsım=scan.nextLine();
                    System.out.println("Güncellenen yeni mail :");
                    String yeniMail=scan.nextLine();
                    oys.ogrenciGuncelleme(guncellenenId,yeniIsım,yeniMail);
                    break;
                case 4:
                    System.out.println("Silinecek öğrenci ID :");
                    int silinecekId=scan.nextInt();
                    oys.ogrenciSilme(silinecekId);
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor....");
                    cıkısYapılacakMı=true;
                    break;

                default:
                    System.out.println("Geçersiz seçim,lütfen tekrar deneyiniz..");
            }

            if (cıkısYapılacakMı) {
                break;
            }

        }

    }
}
