import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double normalTutar, yasIndirimi, indirimliTutar, mesafeBasiUcret=0.10 , gidisDonusIndirimi, toplamTutar;
        int mesafe, yas, yolculukTipi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        mesafe=sc.nextInt();

        System.out.print("Lutfen Yasinizi giriniz : ");
        yas=sc.nextInt();

        System.out.print("Yolculuk tipiniz tek yon ise 1'e gidis donus ise 2'ye basiniz : ");
        yolculukTipi=sc.nextInt();

        normalTutar=mesafe*mesafeBasiUcret;
        System.out.println("Normal Tutar : " +normalTutar+ " TL");

        if (yas < 12){
            yasIndirimi=normalTutar*0.50;
        }else if(yas >=12 && yas<=24){
            yasIndirimi=normalTutar*0.10;
        }else if (yas>=65){
            yasIndirimi=normalTutar*0.30;
        }else {
            yasIndirimi=normalTutar;
        }

        indirimliTutar=normalTutar-yasIndirimi;
        System.out.println("Indirimli Tutar : " +indirimliTutar+ " TL");

        if (yolculukTipi == 1) {
            gidisDonusIndirimi = indirimliTutar*0;
            toplamTutar = indirimliTutar-gidisDonusIndirimi;
            System.out.println("Toplam Tutar :" +toplamTutar + " TL" );
        } else if (yolculukTipi == 2){
            gidisDonusIndirimi=indirimliTutar*0.20;
            toplamTutar=indirimliTutar-gidisDonusIndirimi;
            System.out.println("Toplam Tutar :" +toplamTutar + " TL");
        }else {
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz.");
        }
    }
}

