import java.util.Scanner;

public class HackerRankGame {
    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) {
            return false;
        }
        if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }

        game[i] = 1;

        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        while (q-- > 0) {
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[n];

            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }

            System.out.println(canWin(leap, game, 0) ? "YES" : "NO");
        }

        scanner.close();
    }
}
