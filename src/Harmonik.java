public class Harmonik {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmoniSum = 0;

        for (int i = 0; i < numbers.length; i++){
            harmoniSum += 1.0;
        }
        double harmonicMean = numbers.length / harmoniSum;
        System.out.println("Harmonic ortalama: " + harmonicMean);
    }
}