package kata.graphs;

/**
 * Problem: Number of Islands
 * <p>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land)
 * and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands
 * horizontally or vertically. You may assume all four edges of the grid
 * are all surrounded by water.
 * <p>
 * Example:
 * Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 */
public class NumberOfIslands {
    int M;
    int N;


    public int[][] direct = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public boolean isValid(char[][] grid, int x, int y) {
        return (x >= 0 && x < M && y >= 0 && y < N && grid[x][y] == '1');
    }

    public void dfsTraversal(char[][] grid, int x, int y, boolean[][] visited) {
        if (!isValid(grid, x, y)) {
            return;
        }

        visited[x][y] = true;

        for (int[] pais : direct) {
            int newX = x + pais[0];
            int newY = y + pais[1];
            if (isValid(grid, newX, newY) && !visited[newX][newY]) {
                dfsTraversal(grid, newX, newY, visited);
            }
        }

    }

    public int solve(char[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        M = grid.length;
        N = grid[0].length;
        int answer = 0;

        boolean[][] visited = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfsTraversal(grid, i, j, visited);
                    answer++;
                }
            }
        }
        return answer;
    }
}
