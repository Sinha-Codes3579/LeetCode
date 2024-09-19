package com.min_no_of_days_to_disconnect_islands;

public class solutions {
    // Helper function to perform DFS to explore the island
    private void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0 || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i, j - 1);
    }

    // A function to count the number of islands (connected groups of 1's)
    private int countIslands(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                    dfs(grid, visited, i, j); // Explore the island
                }
            }
        }
        return count;
    }

    public int minDays(int[][] grid) {
        // Step 1: Check if already disconnected (more than one island)
        if (countIslands(grid) != 1) return 0;
        int m = grid.length, n = grid[0].length;

        // Step 2: Try removing a single land cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0; // Remove the land cell
                    if (countIslands(grid) != 1) return 1; // Check if disconnected
                    grid[i][j] = 1; // Restore the land cell
                }
            }
        }

        // Step 3: Try removing two land cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0; // Remove the first land cell
                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < n; y++) {
                            if (grid[x][y] == 1) {
                                grid[x][y] = 0; // Remove the second land cell
                                if (countIslands(grid) != 1) return 2; // Check if disconnected
                                grid[x][y] = 1; // Restore the second land cell
                            }
                        }
                    }
                    grid[i][j] = 1; // Restore the first land cell
                }
            }
        }

        // If we cannot disconnect the island by removing one or two cells
        return 3;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 0, 0, 0}
        };

        solutions sol = new solutions();
        int result = sol.minDays(grid);
        System.out.println("Minimum number of days to disconnect the island: " + result);
    }
}
