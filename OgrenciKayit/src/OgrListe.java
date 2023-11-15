import java.util.Scanner;

public class OgrListe {
    OgrNode head=null;
    OgrNode tail=null;

    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
    Scanner scanner=new Scanner(System.in);
    OgrNode temp=null;
    OgrNode temp2=null;
    void ekle(){
        System.out.println("bilgisayar bölümüne kayıt olacak oğrenci bilgileri:");
        System.out.println("numara : "); numara=scanner.nextInt();
        scanner.nextLine();
        System.out.println("ad : "); ad=scanner.nextLine();
        System.out.println("soyad : "); soyad=scanner.nextLine();
        System.out.println("vize : "); vize=scanner.nextInt();
        System.out.println("final : "); fin=scanner.nextInt();


      OgrNode eleman = new OgrNode(numara,ad,soyad,vize,fin);
      if (head==null){
          head=eleman;
          System.out.println("liste yapısı oluştu");
      }
      else {
          eleman.next=head;
          head=eleman;
          tail=eleman;
          System.out.println(numara+" numaralı öğrenci kayıt edildi");

      }

    }
    void sil(){
        if (head==null){
            System.out.println("Liste boş");
        }
        else {
            System.out.println("Silmek istediğiniz öğrenci numarasını giriniz:");
            numara=scanner.nextInt();
            if (numara==head.numara && head.next==null){
                head=null;
                tail=null;
                System.out.println(numara+" numaralı öğrenci silindi listede baska eleman kalmadı");
            } else if (numara==head.numara && head.next!=null) {
                head=head.next;
                System.out.println(numara+" numaralı öğrenci silindi");
            }
            else {
                temp=head;
                while (temp.next!=null){
                    if (numara==temp.numara){
                        temp2.next=temp.next;
                        System.out.println(numara+" numaralı öğrenci silindi");
                    }
                    temp2=temp;
                    temp=temp.next;
                }
                if (numara==temp.numara){
                    temp2.next=null;
                    tail=temp2;
                    System.out.println(numara+" numaralı öğrenci silindi");
                }

            }
        }
    }
    void yazdir(){
        if (head==null){
            System.out.println("liste bos");
        }
        else {
            temp=head;
            while (temp!=null){
                System.out.println(temp.numara+" numaralı öğrenci bilgileri");
                System.out.println("****************************************");
                System.out.println("ad         : "+ temp.ad);
                System.out.println("soyad     : "+ temp.soyad);
                System.out.println("vize      : "+ temp.vize);
                System.out.println("final     : "+ temp.fin);
                System.out.println("ortalama  : "+ temp.ortalama);
                System.out.println("durum     : "+ temp.durum);
                System.out.println("****************************************");

                temp=temp.next;
            }

        }
    }
    void enBasariliOgrenci(){
        if (head==null){
            System.out.println("liste bos");
        }
        else {
            temp=head;
            double buyuk=temp.ortalama;

            while (temp!=null){
                if (buyuk<temp.ortalama){
                    buyuk=temp.ortalama;
                    numara= temp.numara;
                    ad= temp.ad;
                    soyad= temp.soyad;
                    vize= temp.vize;
                    fin= temp.fin;
                    ortalama=temp.ortalama;
                    durum= temp.durum;
                }

                temp=temp.next;
            }
            System.out.println("En basrılı öğrenci bilgileri");
            System.out.println("****************************************");
            System.out.println("ad        : "+ ad);
            System.out.println("soyad     : "+ soyad);
            System.out.println("vize      : "+ vize);
            System.out.println("final     : "+ fin);
            System.out.println("ortalama  : "+ ortalama);
            System.out.println("durum     : "+ durum);
            System.out.println("****************************************");


        }
    }


}
