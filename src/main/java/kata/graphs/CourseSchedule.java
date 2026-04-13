package kata.graphs;

import java.util.*;

/**
 * Problem: Course Schedule
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0
 * to numCourses - 1. You are given an array prerequisites where
 * prerequisites[i] = [ai, bi] indicates that you must take course bi first
 * if you want to take course ai.
 * <p>
 * You can think of this as a directed graph:
 * bi -> ai
 * meaning course bi must be completed before course ai can be taken.
 * <p>
 * Return true if it is possible to finish all courses.
 * Return false if there is any circular dependency that makes it impossible.
 * <p>
 * A cycle means at least one course eventually depends on itself.
 * For example:
 * 0 requires 1, 1 requires 2, and 2 requires 0.
 * In that case, no valid ordering exists.
 * <p>
 * If the graph is acyclic, then there exists at least one valid order
 * in which all courses can be completed.
 * <p>
 * Constraints to think about while solving:
 * - some courses may have no prerequisites
 * - the graph may have multiple disconnected components
 * - there may be duplicate-looking chains that merge into the same course
 * - the input may contain zero courses
 * <p>
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Explanation: take course 0 first, then course 1.
 * Output: true
 * <p>
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Explanation: to take 1 you need 0, and to take 0 you need 1.
 * This creates a cycle.
 * Output: false
 * <p>
 * Example 3:
 * Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 * Explanation: one valid order is [0,1,2,3] or [0,2,1,3].
 * Output: true
 */
public class CourseSchedule {
    public class Pair {
        int parent;
        int child;

        Pair(int parent, int child) {
            this.parent = parent;
            this.child = child;
        }
    }

    class Graph {
        Map<Integer, List<Integer>> adjList;

        Graph() {
            adjList = new HashMap<>();
        }

        public void addEdge(int u, int v) {
            adjList.putIfAbsent(u, new ArrayList<>());

            adjList.get(u).add(v);
        }

        public List<Integer> getConnections(int u){
            return adjList.getOrDefault(u,new ArrayList<>());
        }

    }

    public static boolean detecCycleDfs(Graph g, Set<Integer> visited, Set<Integer> path , int source){
        visited.add(source);
        path.add(source);
        for(int i: g.getConnections(source)){
            if (!visited.contains(i)){
                if (detecCycleDfs(g,visited,path,i)){
                    return true;
                }
            }else if (path.contains(i)){
                return true;
            }
        }
        path.remove(source);
        return false;
    }

    public boolean solve(int numCourses, int[][] prerequisites) {
        Graph g = new Graph();
        for (int[] con : prerequisites){
            g.addEdge(con[1] , con[0]);
        }
        Set<Integer> visited = new HashSet<>();
        Set<Integer> path = new HashSet<>();
        for (int i=0 ; i<numCourses ; i++){
            if (!visited.contains(i)){
                if(detecCycleDfs(g,visited,path,i)){
                    return false;
                }
            }
        }
        return true;
    }
}
