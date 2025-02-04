import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EhliyetKontrol {
    public static void main(String[] args) {
        try {
            // Dosyadan yaş bilgisini oku
            File dosya = new File("veriler.txt");
            Scanner scanner = new Scanner(dosya);
            int yas = scanner.nextInt();

            // Ehliyet kontrolü
            String sonuc;
            if (yas >= 18) {
                sonuc = "Ehliyet alabilirsiniz.";
            } else {
                sonuc = "Ehliyet alamazsınız.";
            }

            // Sonucu dosyaya yaz
            FileWriter yazici = new FileWriter("sonuclar.txt");
            yazici.write(sonuc);
            yazici.close();

            System.out.println("İşlem tamamlandı. Sonuç 'sonuc.txt' dosyasına yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosya işlemlerinde bir hata oluştu.");
            e.printStackTrace();
        }
    }
}