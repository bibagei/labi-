public class Main {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.2, 3.7, 4.5},
                {2.9, 5.1, 6.6},
                {7.0, 8.8, 9.3}
        };

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        // Округление элементов
        int[][] roundedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                roundedMatrix[i][j] = (int) Math.round(matrix[i][j]);
            }
        }

        System.out.println("\nОкруглённая матрица:");
        printMatrix(roundedMatrix);
    }

    // Метод для вывода double-матрицы
    static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Метод для вывода int-матрицы
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
