class Edge {
    int u, v, w;
    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}

public class Kruskal {

    static int parent[] = new int[5];

    static int find(int i) {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    static void union(int x, int y) {
        int a = find(x);
        int b = find(y);
        parent[a] = b;
    }

    public static void main(String[] args) {

        Edge edges[] = {
                new Edge(0,1,2),
                new Edge(1,2,3),
                new Edge(0,3,6),
                new Edge(1,4,5)
        };

        for (int i = 0; i < 5; i++)
            parent[i] = i;

        int cost = 0;

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i].u;
            int v = edges[i].v;

            if (find(u) != find(v)) {
                cost += edges[i].w;
                union(u, v);
            }
        }

        System.out.println("MST Cost: " + cost);
    }
}