
/*
 * Adjacency list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vertex = sc.nextInt();
    int edges = sc.nextInt();

    ArrayList<Integer> graph[] = new ArrayList[vertex];

    for (int i = 0; i < vertex; i++) {
      graph[i] = new ArrayList<>();
    }
    for (int i = 0; i < edges; i++) {
      int v = sc.nextInt();
      int u = sc.nextInt();

      graph[u].add(v);
      graph[v].add(u);
    }

    for (int i = 0; i < vertex; i++) {
      for (int j : graph[i]) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
