package kata.graphs;

public class FloodFill {
    int M;
    int N;

    public int[][] direct = new int[][]{
            {0, 1}, {1, 0}, {-1, 0}, {0, -1}
    };

    public int[][] solve(int[][] image, int sr, int sc, int color) {

        if (image == null || image.length == 0 || image[0].length == 0) {
            return new int[][]{};
        }

        M = image.length;
        N = image[0].length;

        int originalColor = image[sr][sc];

        // 🔥 Important edge case
        if (originalColor == color) return image;

        dfsTraversal(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfsTraversal(int[][] image, int x, int y, int originalColor, int color) {

        // ✅ Single place for all checks
        if (x < 0 || y < 0 || x >= M || y >= N || image[x][y] != originalColor) {
            return;
        }

        // mark visited by coloring
        image[x][y] = color;

        for (int[] d : direct) {
            dfsTraversal(image, x + d[0], y + d[1], originalColor, color);
        }
    }
}