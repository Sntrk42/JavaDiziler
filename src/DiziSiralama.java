import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
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
        Arrays.sort(list);
        System.out.println("\nDizinin küçükten büyüğe sıralanmış hali: " + Arrays.toString(list));
    }
}
