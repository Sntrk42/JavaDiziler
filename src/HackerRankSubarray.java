import java.util.Scanner;

public class HackerRankSubarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutu: ");
        int size = input.nextInt();

        int[] list = new int[size];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("Girdiğiniz Dizi: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }

        // Alt dizileri bulma
        int negatifAltDiziSayisi = 0;
        for (int start = 0; start < size; start++) {
            for (int end = start; end < size; end++) {
                int toplam = 0;
                for (int i = start; i <= end; i++) {
                    toplam += list[i];
                }
                if (toplam < 0) {
                    negatifAltDiziSayisi++;
                    System.out.print("\nNegatif Alt Dizi: ");
                    for (int i = start; i <= end; i++) {
                        System.out.print(list[i] + " ");
                    }
                }
            }
        }
        System.out.println("\nToplam Negatif Alt Dizi Sayısı: " + negatifAltDiziSayisi);
    }
}
