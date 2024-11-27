import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Graph
 */
public class Graph {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vertex = sc.nextInt();
    int edges = sc.nextInt();

  
    int adj[][] = new int[vertex+1][vertex+1];


    for (int i = 0; i < edges; i++) {
      int v = sc.nextInt();
      int u = sc.nextInt();
     
      adj[u][v]  =1;
      adj[v][u] =1;

    }
    
    for (int i = 0; i < vertex; i++) {
      for (int j = 0; j < vertex; j++) {
        System.out.print(adj[i][j] + " ");
      }
      System.out.println();
    }
  }
}