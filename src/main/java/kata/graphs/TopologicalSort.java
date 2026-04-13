package kata.graphs;

import java.util.*;

public class TopologicalSort {
    static class Graph {
        Map<Integer, List<Integer>> adjList;

        public Graph() {
            adjList = new HashMap<>();
        }

        public void addEdge(int u, int v) {
            adjList.putIfAbsent(u, new ArrayList<>());
            adjList.get(u).add(v);
        }

        public List<Integer> getConnections(int u) {
            return adjList.getOrDefault(u, new ArrayList<>());
        }

    }
    public static List<Integer> topologicalSort(Graph g){
        Set<Integer> visited  = new HashSet<>();
        Stack<Integer> path  = new Stack<>();

        for(int node: g.adjList.keySet()){
            if (!visited.contains(node))
                dfsTraversal(node, g, visited,path);
        }
        List<Integer> answer = new ArrayList<>();
        while(!path.empty()){
            answer.add(path.pop());
        }
        return answer;
    }

    private static void dfsTraversal(int node, Graph g, Set<Integer> visited, Stack<Integer> path) {
        visited.add(node);
        for (int conn: g.getConnections(node)){
            if (!visited.contains(conn)){
                dfsTraversal(conn, g, visited,path);
            }
        }
        path.push(node);
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,5);
        g.addEdge(4,5);

        System.out.println(topologicalSort(g));

    }
}
