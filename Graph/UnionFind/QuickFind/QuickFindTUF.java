/**
 * QuickFindTUF
 */
public class QuickFindTUF {

    private static int[] id;

    public QuickFindTUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public static boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    public void union()
}