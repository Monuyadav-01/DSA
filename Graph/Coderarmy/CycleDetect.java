import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetect {
  public static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int vertex) {
    /*  boolean visited[] = new boolean[vertex];
    *for (int i = 0; i < vertex; i++) {
    * if (visited[i]) {
    *    if (dfs(adj, i, -1, visited)) {
    *      return true;
    *    }
    *  }
    *}
    */




    /*
     * bfs code :>
     * Approaches :->
     * make a visited boolean array size of vertex
     * make a perent array for store parents size of visited
     * make a queue
     * for loop for neighbour and check the visited and parent not equal to neighbour  so return the true
     * if-> not visited neighbour then we visited true and change the parent
     * 
     */

    boolean visited[] = new boolean[vertex];
    int parent[] = new int[visited.length];
    visited[0] = true;
    parent[0] = -1;

    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    while(!q.isEmpty())
    {
      int node = q.poll();
      for (int neighbour : adj.get(node)) {
        if (visited[neighbour] && neighbour != parent[node]) {
          return true;
        }
        else if (!visited[neighbour]) {
          visited[neighbour] = true;
          parent[neighbour] = node;
          q.add(neighbour);
        }
      }
    }    
    return false;
  }
  /* dfs code
  
  public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int start, int parent, boolean visited[]) {
    visited[start] = true;
    for (int neighbour : adj.get(start)) {
      if (!visited[neighbour]) {
        if (dfs(adj, neighbour, start, visited)) {
          return true;
        } else if (neighbour != parent) {
          return true;
        }
      }
    }
    return false;
  }
  */
  

  // bfs code 
  public static void main(String[] args) {
    
  }
}
