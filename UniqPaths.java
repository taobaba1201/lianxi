

public class UniqPaths {

    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        System.out.println(findUniqPaths(m, n));
    }

    private static int findUniqPaths(int m, int n) {
        int[][] arr = new int[101][101];
        if (m == 1 || n == 1) {
            return 1;
        }
        arr[m - 1][n] = findUniqPaths(m - 1, n);
        arr[n][m - 1] = arr[m - 1][n];
        arr[m][n - 1] = findUniqPaths(m, n - 1);
        arr[n - 1][m] = arr[m][n - 1];
        return arr[m -1][n] + arr[m][n - 1];
    }

        
}