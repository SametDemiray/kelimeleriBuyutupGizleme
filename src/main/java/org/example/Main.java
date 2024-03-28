package org.example;
// Klavyeden küçük harflerle girilen kelimenin tüm harflerini büyüterek ve "iki harf açık, iki harf yıldızla kapalı"
// olarak yeniden yazdıran bir Java programı.
// Kelimeyi girin: telekominikasyon
// Yeni kelime: T**EK**IN**AS**N
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelimeyi girin: ");
        String kelime = scanner.nextLine();

        String yeniKelime = ikiHarfAcikIkiHarfYildizlaKapali(kelime);
        System.out.println("Yeni kelime: " + yeniKelime);
    }

    public static String ikiHarfAcikIkiHarfYildizlaKapali(String kelime) {
        StringBuilder yeniKelime = new StringBuilder();
        for (int i = 0; i < kelime.length(); i++) {
            char c = kelime.charAt(i);
            if (i % 4 == 0 || (i + 1) % 4 == 0) {
                yeniKelime.append(Character.toUpperCase(c));
            } else {
                yeniKelime.append('*');
            }
        }
        return yeniKelime.toString();
    }

}