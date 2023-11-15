import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secim=-1;
        OgrListe ogrListe=new OgrListe();
        Scanner scanner=new Scanner(System.in);

        while (secim!=0){

            System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması");
            System.out.println("1 yeni kayıt");
            System.out.println("2 kayıtları sil");
            System.out.println("3 kayıtları listele");
            System.out.println("4 En basarılı öğrenci bilgileri");
            System.out.println("0 çıkış");
            System.out.println("Seçiniz : " );
            secim=scanner.nextInt();

        if (secim==1){
            ogrListe.ekle();
        }
        else if (secim==2) {
             ogrListe.sil();
        }
        else if (secim==3) {
            ogrListe.yazdir();
        } else if (secim==4) {
            ogrListe.enBasariliOgrenci();
        } else if (secim==0) {
            System.out.println("Programı sonlandırdınız...");
        }
        else
            System.out.println("Hatalı seçim yaptın");
        }


    }
}