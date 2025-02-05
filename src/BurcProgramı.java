import java.util.Scanner;

public class BurcProgramı {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("-------------NE ÇIKARSA BAHTINA BURÇ YORUMLARINA HOŞGELDİNİZ-------------");
        System.out.println("###### Aylar'ın Sayi olarak Gösterimi #####");
        System.out.println(" 1==>   Ocak Ayı \n 2==>   Şubat Ayı\n 3==>   Mart Ayı" +
                " \n 4==>   Nisan Ayı \n 5==>   Mayıs Ayı\n 6==>   Haziran Ayı" +
                " \n 7==>   Temmuz Ayı\n 8==>   Ağustos Ayı\n 9==>   Eylül Ayı\n 10==>  Ekim Ayı\n 11==>  Kasım Ayı\n 12==>  Aralık Ayı");
        System.out.println("###### Lütfen Doğduğunuz Ayı Seçiniz ######");
        int ay = scan.nextInt();
        System.out.println("Lütfen Doğum Tarihinizin Gününü Giriniz");
        int gun = scan.nextInt();

        if (ay > 0 && ay < 13) {

            switch (ay) {

                case 1:
                    System.out.println("Seçtiğiniz Ay Ocaktır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Oğlaktır....");
                            System.out.println("Pozitif kaliteleri: Zorluklara dayanan, güvenilir, sabırlı, kararlı, düzenli\n" +
                                    "Olumsuz ve zayıf yanları: İnatçılık, kötümser, cimri, materyalist, mevki düşkünü.");
                        } else {
                            System.out.println("Burcunuz Kovadır.....");
                            System.out.println("Pozitif kaliteleri: Hümanist, ileri görüşlü, yenilikçi, objektif, akılcı ve bilimsel, sosyalleşmelte yetenekli.\n" +
                                    "Olumsuz ve zayıf yanları: Geleneklere karşı gelen, farklı olmaya çalışan, huzursuz ve asi.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;

                case 2:
                    System.out.println("Seçtiğiniz Ay Şubattır");
                    if (gun >= 1 && gun <= 29) {

                        if (gun <= 19) {
                            System.out.println("Burcunuz Kovadır....");
                            System.out.println("Pozitif kaliteleri: Hümanist, ileri görüşlü, yenilikçi, objektif, akılcı ve bilimsel, sosyalleşmelte yetenekli.\n" +
                                    "Olumsuz ve zayıf yanları: Geleneklere karşı gelen, farklı olmaya çalışan, huzursuz ve asi.");
                        } else {
                            System.out.println("Burcunuz Balıktır...");
                            System.out.println("Pozitif kaliteleri: Duyarlı, merhametli, hayal gücü kuvvetli, sanatsal ilham ve yaratıcılık sahibi,iyi kalpli, güçlü inanç sahibi.\n" +
                                    "Olumsuz ve zayıf yanları: İradesiz, kararsız, özgüveni düşük. Aşırı hayalperest, gerçeklerden kaçan ve kendine acıyan.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 3:
                    System.out.println("Seçtiğiniz Ay Marttır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Balıktır....");
                            System.out.println("Pozitif kaliteleri: Duyarlı, merhametli, hayal gücü kuvvetli, sanatsal ilham ve yaratıcılık sahibi,iyi kalpli, güçlü inanç sahibi.\n" +
                                    "Olumsuz ve zayıf yanları: İradesiz, kararsız, özgüveni düşük. Aşırı hayalperest, gerçeklerden kaçan ve kendine acıyan.");
                        } else {
                            System.out.println("Burcunuz Koçtur.....");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 4:
                    System.out.println("Seçtiğiniz Ay Nisandır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Koçtur....");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        } else {
                            System.out.println("Burcunuz Boğadır.....");
                            System.out.println("Pozitif kaliteleri: Arkadaş canlısı, dayanma gücü yüksek, iradeli, estetik zevkleri gelişmiş, sezgileri güçlü, sabırlı.\n" +
                                    "Olumsuz ve zayıf yanları: İnatçı, zevk düşkünü, tembel, açgözlülük, esneklikten yoksunluk, aşırı sahiplenicilik.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 5:
                    System.out.println("Seçtiğiniz Ay Mayıstır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 20) {
                            System.out.println("Burcunuz Boğadır....");
                            System.out.println("Pozitif kaliteleri: Arkadaş canlısı, dayanma gücü yüksek, iradeli, estetik zevkleri gelişmiş, sezgileri güçlü, sabırlı.\n" +
                                    "Olumsuz ve zayıf yanları: İnatçı, zevk düşkünü, tembel, açgözlülük, esneklikten yoksunluk, aşırı sahiplenicilik.");
                        } else {
                            System.out.println("Burcunuz İkizlerdi...");
                            System.out.println("Pozitif kaliteleri: Entellektüel, mantıklı, çabuk kavrayan, yazı yazmaya ve iletişime yetenekli, konuşkan , eğlenceli, bilgi dolu.\n" +
                                    "Olumsuz ve zayıf yanları: Değişken, kararsız, ikiyüzlü, yüzeysel, maymun iştahlı, duygusal olarak yetersiz, dedikodu, eleştirici.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 6:
                    System.out.println("Seçtiğiniz Ay Hazirandır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 21) {
                            System.out.println("Burcunuz İkizlerdir....");
                            System.out.println("Pozitif kaliteleri: Entellektüel, mantıklı, çabuk kavrayan, yazı yazmaya ve iletişime yetenekli, konuşkan , eğlenceli, bilgi dolu.\n" +
                                    "Olumsuz ve zayıf yanları: Değişken, kararsız, ikiyüzlü, yüzeysel, maymun iştahlı, duygusal olarak yetersiz, dedikodu, eleştirici.");
                        } else {
                            System.out.println("Burcunuz Yengeçtir.....");
                            System.out.println("Pozitif kaliteleri: Empatik, gelişmiş annelik duygusu, koruyucu, fedakar ve başkalarının ihtiyaçlarına duyarlı, güçlü sezgi yeteneği\n" +
                                    "Olumsuz ve zayıf yanları: Aşırı duygusallık, alıngan, değişken ve endişelenen, huzursuz.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 7:
                    System.out.println("Seçtiğiniz Ay Temmuzdur");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 22) {
                            System.out.println("Burcunuz Yengeçtir....");
                            System.out.println("Pozitif kaliteleri: Empatik, gelişmiş annelik duygusu, koruyucu, fedakar ve başkalarının ihtiyaçlarına duyarlı, güçlü sezgi yeteneği\n" +
                                    "Olumsuz ve zayıf yanları: Aşırı duygusallık, alıngan, değişken ve endişelenen, huzursuz.");
                        } else {
                            System.out.println("Burcunuz Aslandır.....");
                            System.out.println("Pozitif kaliteleri: Yüce gönüllü, geniş düşünceli, cömert, kendine güvenen, ilham veren, artistik.\n" +
                                    "Olumsuz ve zayıf yanları: Egoist, hoşgörüsüz, kibirli,");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 8:
                    System.out.println("Seçtiğiniz Ay Ağustostur");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 23) {
                            System.out.println("Burcunuz Aslandır....");
                            System.out.println("Pozitif kaliteleri: Yüce gönüllü, geniş düşünceli, cömert, kendine güvenen, ilham veren, artistik.\n" +
                                    "Olumsuz ve zayıf yanları: Egoist, hoşgörüsüz, kibirli,");
                        } else {
                            System.out.println("Burcunuz Başaktır.....");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 9:
                    System.out.println("Seçtiğiniz Ay Eylüldür");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 23) {
                            System.out.println("Burcunuz Başaktır....");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        } else {
                            System.out.println("Burcunuz Terazidir.....");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: Acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 10:
                    System.out.println("Seçtiğiniz Ay Ekimdir");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 23) {
                            System.out.println("Burcunuz Terazidir....");
                            System.out.println("Pozitif kaliteleri: Cesur, samimi, enerjik, özgürlüğüne çok düşkün, spontane, maceracı ve girişken, başkalarına heves veren kişilik, çocuksu heyecan\n" +
                                    "Olumsuz ve zayıf yanları: Acelecilik, egoizm, her şeyi hemen anında istemek ve hemen tepki vermek.");
                        } else {
                            System.out.println("Burcunuz Akreptir.....");
                            System.out.println("Pozitif kaliteleri: Kendini dönüştürebileme gücü, derin kavrayış, sezgi gücü, dayanıklı ve kararlı, başkalarını etkileme gücü.\n" +
                                    "Olumsuz ve zayıf yanları: Kıskançlık, sahiplenicilik, kincilik, kuşkuculuk, güce düşkünlük.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 11:
                    System.out.println("Seçtiğiniz Ay Kasımdır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 22) {
                            System.out.println("Burcunuz Akreptir....");
                            System.out.println("Pozitif kaliteleri: Kendini dönüştürebileme gücü, derin kavrayış, sezgi gücü, dayanıklı ve kararlı, başkalarını etkileme gücü.\n" +
                                    "Olumsuz ve zayıf yanları: Kıskançlık, sahiplenicilik, kincilik, kuşkuculuk, güce düşkünlük.");
                        } else {
                            System.out.println("Burcunuz Yaydır.....");
                            System.out.println("Pozitif kaliteleri: Yeniliğe açık, hoşgörülü, cömert, felsefi, iyimser, inançlı, özgürlüğe düşkün ve coşkulu.\n" +
                                    "Olumsuz ve zayıf yanları: Dogmatik, fanatik, patavatsız ve abartıya açık.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;
                case 12:
                    System.out.println("Seçtiğiniz Ay Aralıktır");
                    if (gun >= 1 && gun <= 31) {

                        if (gun <= 21) {
                            System.out.println("Burcunuz Yaydır....");
                            System.out.println("Pozitif kaliteleri: Yeniliğe açık, hoşgörülü, cömert, felsefi, iyimser, inançlı, özgürlüğe düşkün ve coşkulu.\n" +
                                    "Olumsuz ve zayıf yanları: Dogmatik, fanatik, patavatsız ve abartıya açık.");
                        } else {
                            System.out.println("Burcunuz Oğlaktır.....");
                            System.out.println("Pozitif kaliteleri: Zorluklara dayanan, güvenilir, sabırlı, kararlı, düzenli\n" +
                                    "Olumsuz ve zayıf yanları: İnatçılık, kötümser, cimri, materyalist, mevki düşkünü.");
                        }

                    } else {
                        System.out.println("Hatalı gun girişi yaptınız lütfen tekrar doğru sayi giriniz");
                    }
                    break;


            }
            System.out.println(" =====>     Programı hazırlayan Oğuzhan Melih Güçlü 2025 yılında size bol şans diler :)))    <=====  ");
        } else {
            System.out.println("Hatalı giriş yaptınız");
        }

    }
}
