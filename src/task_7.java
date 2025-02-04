//Tapshiriq matrix arrayle etdiyimizi for each le edin

public class task_7 {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7,8,9}};
        for (int[] i : matrix) {
            for (int numbers : i) {
                System.out.print(numbers+ " ");
            }
        }
    }
}

