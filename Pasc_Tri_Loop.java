class PascalLoop {
    public static void main(String[] args) {
        // using nCr --11th class ==> n!/(n-r)! * r!

        // Promting user for number of rows
        System.out.println("Enter number of Rows");
        int rows = new java.util.Scanner(System.in).nextInt(); // using anonymous Scanner obj, taking int value

        for (int i = 0; i < rows; i++) {
            // spcing
            for (int s = 0; s <= rows - i; s++)
                System.out.print("  ");
            // using nCr
            for (int j = 0; j <= i; j++)
                System.out.print((fact(i) / (fact(i - j) * fact(j))) + "  ");

            System.out.println();
        }
    }

    static int fact(int n) {
        return n < 1 ? 1 : n * fact(n - 1);
    }
}