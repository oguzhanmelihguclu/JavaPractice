package OgrenciBilgiSistemi;

public class C02_Ogrenci {

    private int kullanıcıNo;  // class level bir private kullanıcı variable'ı belirledik.
    private String isim;      // class level bir private isim variable'ı belirledik.
    private String email;     // class level bir private email variable'ı belirledik.

    public C02_Ogrenci(int id, String isim, String email) {  // parametreli constructor olusturduk

        this.kullanıcıNo = id;    // constructor parametrelerini class level'a atadık
        this.isim = isim;
        this.email = email;

    }

    public String getEmail() {       // variable'lar private oldugu icin generate bölümünden get ve set atadık
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return kullanıcıNo;
    }

    public void setId(int id) {
        this.kullanıcıNo = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override             // generate bölümünden to string atadık
                          // panelde Ogrenci{id=1, isim='Ahmet', email='ahmet@example.com'} böyle bir ifade görünmesi icin yapıldı
    public String toString() {
        return "Ogrenci{" +
                "id=" + kullanıcıNo +
                ", isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

