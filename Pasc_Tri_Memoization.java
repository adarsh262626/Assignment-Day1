import java.util.HashMap;
import java.util.Scanner;

class PascalRecursionMemoization {
    static HashMap<String, Integer> cache = new HashMap<>();

    public static int pasc(int i, int j) {

        if (cache.containsKey(i + "" + j)) // 23
            return cache.get(i + "" + j);

        int nCr = (j == 0 || i == j) ? 1 : pasc(i - 1, j - 1) + pasc(i - 1, j);
        cache.put(i + "" + j, nCr);
        return nCr;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of Rows : ");
        int rows = new Scanner(System.in).nextInt();

        for (int i = 0; i < rows; i++) {
            for (int s = 0; s <= rows - i; s++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print(pasc(i, j) + " ");
            System.out.println();
        }
    }
}