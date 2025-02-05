package OgrenciBilgiSistemi;

import java.util.ArrayList;

public class C03_OgrenciYonetimSistemi {

    private ArrayList<C02_Ogrenci> ogrenciler;   // C03 sınıfı C02 nesnelerini tutan bir ArrayList içerir.
    private int kullanılanId;

    public C03_OgrenciYonetimSistemi() {     // Consturactor

        ogrenciler = new ArrayList<>();      // C02 den gelen bilgileri bir arrayListe tanımladık.
        kullanılanId=1;                     // programa bilgi giren ilk kişinin kullanıcıNumarası=1 belirledik.

    }

    public void ogrenciEkleme(String isim , String email) {        // OgrenciEkleme methodu olusturduk

        C02_Ogrenci yeniOgrenci = new C02_Ogrenci(kullanılanId++,isim,email);   // C02 sınıfı bir obje olusturduk.
        ogrenciler.add(yeniOgrenci);             // arrayliste c02den gelen bilgileri atadık.
        System.out.println("Öğrenci başarıyla eklendi.." +yeniOgrenci);// burada ise c02den gelen yeniogrenci bilgilerini yazdırdık

    }

    public void ogrencileriListele (){           // OgrencileriListele adlı method olusturduk
        System.out.println("==ÖĞRENCİ LİSTESİ==");
        if (ogrenciler.isEmpty()) {         // Eğer array boş ise öğrenci yoktur dedik.
            System.out.println("Henüz kayıtlı bir öğrenci yoktur..");
        }else {    // array bos degilse bana ogrenciler arrayınden her bir c02_ogrenci sınıfından girilen bilgileri getir dedik.
            for (C02_Ogrenci each:ogrenciler) {
                System.out.println(each);
            }
        }
    }

    public void ogrenciGuncelleme(int id , String isim , String email) { // ogrenciGuncelleme methodu olusturduk

        for (C02_Ogrenci each : ogrenciler) { // ogrenciler arrayinden c02 ogrenci sınıfından girilen her bilgiyi getir.
            if (each.getId()==id) {  // eger getirelen id ile degistirilmek istenen id birbirine eşitse isim ve emaili güncelle.
                each.setIsim(isim);
                each.setEmail(email);
                System.out.println("Öğrenci bilgileri güncellendi : "+ each);
                return;
            }
        }

        System.out.println("Öğrenci bulunamadı !");

    }

    public void ogrenciSilme (int id ) {   // ogrenci silme adlı method olusturduk

        for (C02_Ogrenci each : ogrenciler) { // ogrenciler arrayından her bir c02 ogrenci ile ilgili bilgiyi getir.
            if (each.getId()==id) {    // eger getirilen id ve silinmek istenen id birbirine eşitse id yi sil.
                ogrenciler.remove(each);
                System.out.println("Öğrenci silindi : " + each);
                return;
            }
        }

        System.out.println("Öğrenci bulunamadı!!");

    }


}
