import java.util.*;
public class Prim {
    public static void main(String[] args) {

        int[][] g = {{0,2,0,6,0},{2,0,3,8,5},{0,3,0,0,7},{6,8,0,0,9},{0,5,7,9,0}};


        int n = g.length;

        boolean[] vis = new boolean[n];
        int[] key = new int[n];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) if (!vis[j] && (u == -1 || key[j] < key[u])) u = j;
            vis[u] = true;
            for (int v = 0; v < n; v++) if (g[u][v] != 0 && !vis[v] && g[u][v] < key[v]) key[v] = g[u][v];
        }
        System.out.println(Arrays.stream(key).sum());
    }
}