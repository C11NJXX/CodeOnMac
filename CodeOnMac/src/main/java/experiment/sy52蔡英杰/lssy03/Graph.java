package main.java.experiment.sy52蔡英杰.lssy03;

public class Graph {
    public int[] points;
    public Edge[] edges;

    public Graph(int[] points, Edge[] edges) {
        this.points = points;
        this.edges = edges;
    }

    public static void printPoints(int[] points) {
        for (int i : points) {
            System.out.println("点 " + i);
        }
    }

    public static void printEdges(Edge[] edges) {
        int count = 1;
        for (Edge e : edges) {
            System.out.print("第" + count + "条边 : ");
            System.out.println(e.toString());
            count++;
        }
    }

    public static void sortEdge(Edge[] edges) {
        //遍历权重
        for (int i = 0; i < edges.length; i++) {
            for (int j = i + 1; j < edges.length; j++) {
                if (edges[j].weight < edges[i].weight) {
                    Edge tmp = edges[j];
                    edges[j] = edges[i];
                    edges[i] = tmp;
                }
            }
        }
    }

    public static void setEmptyEdge(Edge[] edges) {
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new Edge();
        }
    }
}
