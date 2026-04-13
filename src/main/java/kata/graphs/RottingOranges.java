package kata.graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem: Rotting Oranges
 * <p>
 * You are given an m x n grid where each cell can have one of three values:
 * 0 representing an empty cell,
 * 1 representing a fresh orange, or
 * 2 representing a rotten orange.
 * <p>
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange
 * becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 * If this is impossible, return -1.
 * <p>
 * Example:
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 */
public class RottingOranges {
    public class Pair {
        int x;
        int y;
        Pair(int i,int j){
            x = i;
            y = j;
        }
    }
    int[][] nei = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};

    public int solve(int[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        int M = grid.length;
        int N = grid[0].length;
        int oranges = 0;
        Queue<Pair> visited = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j]==2){
                    visited.offer(new Pair(i,j));
                }else if (grid[i][j] == 1){
                    oranges++;
                }
            }
        }
        int minutes = 0;

        while (!visited.isEmpty()){
            int size = visited.size();
            boolean rotting = false;
            for (int i=0 ; i<size ; i++){
                Pair p = visited.poll();

                //now neighbours
                for (int[] bro: nei){
                    int newI = p.x+bro[0];
                    int newJ = p.y+bro[1];
                    if (newI>=0 && newJ>=0 && newI<M && newJ<N && grid[newI][newJ]==1){
                        grid[newI][newJ] = 2;
                        visited.offer(new Pair(newI,newJ));
                        oranges--;
                        rotting= true;
                    }
                }

            }
            if (rotting){
                minutes++;
            }
        }
        return  oranges==0? minutes: -1;
    }
}

