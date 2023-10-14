import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        int[] list2 = Arrays.copyOf(list, list.length);

        System.out.println("Sıralanmış Dizi: " + Arrays.toString(list));
        System.out.println("En küçük 2. değer: " + list2[1]);

        int lastIndex = list2.length - 2;
        if (lastIndex >= 0){
            int penultimate = list2[lastIndex];
            System.out.println("En büyük 2.değer: " + penultimate);
        }
    }
}
