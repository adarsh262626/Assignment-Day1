import java.util.Scanner;

class PascalRecursion {
    public static int pasc(int i, int j) {
        return (j == 0 || i == j) ? 1 : pasc(i - 1, j - 1) + pasc(i - 1, j);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of Rows : ");
        int rows = new Scanner(System.in).nextInt();

        for (int i = 0; i < rows; i++) {
            // spaces
            for (int s = 0; s <= rows - i; s++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print(pasc(i, j) + " ");
            System.out.println();
        }
    }
}