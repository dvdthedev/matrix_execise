import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Linhas Verticais:");
        int matrixV = sc.nextInt();
        System.out.println("Linhas Horizontais:");
        int matrixH = sc.nextInt();

        int[][] mat = new int[matrixV][matrixH];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int incidence = sc.nextInt();


        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == incidence) {
                    var vertical = mat.length - 1;
                    var horizontal = mat[i].length - 1;
                    if (i == 0 && j == 0) {
                        System.out.printf("""
                                Position %d,%d:
                                Right: %d
                                Down: %d
                                """, i, j, (mat[i][j + 1]), (mat[i + 1][j]));
                    } else if (0 == i && horizontal != j) {
                        System.out.printf("""
                                Position %d,%d:
                                Right: %d
                                Left: %d
                                Down: %d
                                """, i, j, (mat[i][j + 1]), (mat[i][j - 1]), (mat[i + 1][j]));
                    } else if (0 == i && horizontal == j) {
                        System.out.printf("""
                                Position %d,%d:
                                Left: %d
                                Down: %d
                                """, i, j, (mat[i][j - 1]), (mat[i + 1][j]));
                    } else if (j == 0 && i != horizontal) {
                        System.out.printf("""
                                Position %d,%d:
                                Right: %d
                                Up: %d
                                Down: %d
                                """, i, j, (mat[i][j + 1]), (mat[i - 1][j]), (mat[i + 1][j]));
                    } else if (j == horizontal && i != vertical) {
                        System.out.printf("""
                                Position %d,%d:
                                Left: %d
                                Up: %d
                                Down: %d
                                """, i, j, (mat[i][j - 1]), (mat[i - 1][j]), (mat[i + 1][j]));
                    } else if (vertical == i && 0 == j) {
                        System.out.printf("""
                                Position %d,%d:
                                Right: %d
                                Up: %d
                                """, i, j, (mat[i][j + 1]), (mat[i - 1][j]));
                    } else if (j != horizontal && i == vertical) {
                        System.out.printf("""
                                Position %d,%d:
                                Right: %d
                                Left: %d
                                Up: %d
                                """, i, j, (mat[i][j + 1]), (mat[i][j - 1]), (mat[i - 1][j]));
                    } else if (i == vertical && j == horizontal) {
                        System.out.printf("""
                                Position %d,%d:
                                Left: %d
                                Up: %d
                                """, i, j, (mat[i][j - 1]), (mat[i - 1][j]));
                    } else {
                        System.out.printf("""
                                Position %d,%d:
                                Right: %d
                                Left: %d
                                Up: %d
                                Down: %d
                                """, i, j, (mat[i][j + 1]), (mat[i][j - 1]), (mat[i - 1][j]), (mat[i + 1][j]));
                    }

                }

            }

        }
        sc.close();
    }

}
