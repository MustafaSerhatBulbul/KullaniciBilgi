import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class KullaniciBilgi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Adınızı soyadınızı ve yaşınızı girin (örneğin: john smith 30): ");
        String kullaniciGirisi = scanner.nextLine();

       
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY");
        String gunumuzTarihi = dateFormat.format(new Date());

       
        String[] parcalar = kullaniciGirisi.split(" ");

       
        for (String parca : parcalar) {
            System.out.print(parca.toUpperCase() + " ");
        }

       
        int yas = Integer.parseInt(parcalar[parcalar.length - 1]);
        int dogumYili = Integer.parseInt(gunumuzTarihi) - yas;

      
        System.out.println(dogumYili);

    
        scanner.close();
    }
}
