package Shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NetworkDelay {

  public static int networkDelayTime(int[][] times, int n, int k) {
    ArrayList<ArrayList<pair>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }
    for (int time[] : times) {
      int u = time[0] - 1;
      int v = time[1] - 1;
      int wt = time[2];

      adj.get(u).add(new pair(v, wt));
    }

    PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> x.w - y.w);
    int dis[] = new int[n];
    Arrays.fill(dis, Integer.MAX_VALUE);

    pq.offer(new pair(k - 1, 0));
    dis[k - 1] = 0;

    while (!pq.isEmpty()) {
      int wt = pq.peek().w;
      int top = pq.peek().n;
      pq.poll();

      for (pair node : adj.get(top)) {
        int adjWt = node.w;
        int adjNode = node.n;
        if (dis[adjNode] > wt + adjWt) {
          dis[adjNode] = wt + adjWt;
          pq.offer(new pair(adjNode, dis[adjNode]));
        }
      }
    }

    int maxDist = 0;
    for (int d : dis) {
      if (d == Integer.MAX_VALUE) {
        return -1;
      }
      maxDist = Math.max(maxDist, d);
    }

    return maxDist;
  }

  static class pair {
    int n;
    int w;

    pair(int n, int w) {
      this.n = n;
      this.w = w;
    }
  }

  public static void main(String[] args) {
    int mat[][] = {
        { 2, 1, 1 }, { 2, 3, 1 }, { 3, 4, 1 }
    };
    int n = 4;
    int k = 2;
    System.out.println(networkDelayTime(mat, n, k));
  }
}
