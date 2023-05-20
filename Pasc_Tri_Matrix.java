import java.util.Scanner;

class PascalMatrix {
    static int mat[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows : ");
        int rows = sc.nextInt();

        mat = new int[rows][rows * 2];

        for (int i = 0, j = rows; i < mat.length; i++) { // j = 7
            fill(i, j); // 7
        }

        display();
    }

    static void fill(int i, int j) {
        if (i == 0)
            mat[i][j] = 1;

        else {
            mat[i][j - i] = 1;
            mat[i][j + i] = 1;

            for (int a = j - i + 2; a <= j + i - 1; a += 2) { // 5 < 11
                mat[i][a] = mat[i - 1][a - 1] + mat[i - 1][a + 1];
            }
        }
    }

    static void display() {
        for (int[] is : mat) {
            for (int i : is) {
                System.out.print(i < 1 ? "\t " : (i + "\t"));
            }
            System.out.println();
        }
    }
}