package main.java.experiment.sy52蔡英杰.lssy03;

public class Kruskal {
    public static void main(String[] args) {
        //设置点集合
        int[] points = setPoint();
        //设置边集合
        Edge[] edges = setEdge();
        //Kruskal算法
        kruskalMethod(points, edges);
    }


    private static void kruskalMethod(int[] points, Edge[] edges) {
        //Kruskal算法
        //按照权重从小到大的顺序添加边，已经排序好了直接按照边序号来
        //创建新图(只需要点的总数-1 条边）
        Edge[] newEdge = new Edge[points.length - 1];
        //初始化新边集合
        Graph.setEmptyEdge(newEdge);
        Graph newGraph = new Graph(points, newEdge);
        //循环添加新边
        int count = 0;
        for (int i = 0; i < edges.length; i++) {
            //设置第一,二条边
            if (i == 0 || i == 1) {
                newGraph.edges[i].point1 = edges[i].point1;
                newGraph.edges[i].point2 = edges[i].point2;
                newGraph.edges[i].weight = edges[i].weight;
                count++;
            } else {
                //当边数超过三时，需要判断是否形成回路，如果新生成的边的终点和前面已存在的边的起点重合，则判断为回路
                if (count == points.length - 1) {
                    System.out.println("已添加完" + count + "条边，不再继续添加(注意：本算法只列出了一种最小生成树！）");
                    break;
                }
                //利用循环判断是否有回路
                int j;
                for (j = i - 1; j >= 0; j--) {
                    //如果跳过了一条边，也相当于添加过了，就不要再重新比了，相当于做了一个标记，这条边我不要
                    if (edges[i].point2 == edges[j].point1 && !edges[j].isAdd) {
                        edges[i].isAdd = true;
                        System.out.println("有回路，跳过原第" + (i + 1) + " 条边");
                        break;
                    }
                }
                //判断上方是否正常跳出循环
                if (j >= 0) {
                    //break 跳出，说明有回路，更新 i 为下一条边
                    continue;
                } else {
                    //正常退出，正常添加新边,注意要用 count 来为新的边赋值，否则会随着一些边的跳过，导致 i 作为新边下标的越界问题
                    newGraph.edges[count].point1 = edges[i].point1;
                    newGraph.edges[count].point2 = edges[i].point2;
                    newGraph.edges[count].weight = edges[i].weight;
                    count++;
                }
            }
        }
        //查看新边集合
        Graph.printEdges(newGraph.edges);
    }

    private static int[] setPoint() {
        //创建点集合
        int[] points = new int[5];
        //将点集合的值视为编号
        for (int i = 0; i < 5; i++) {
            points[i] = i + 1;
        }
        //打印点集合
        Graph.printPoints(points);
        return points;
    }

    private static Edge[] setEdge() {
        //构造连通图
        /**
         * 1-2,5
         *
         * 2-3,5
         *
         * 3-5,6
         *
         * 2-4,12
         *
         * 4-5,12
         *
         * 2-5,15
         *
         * 3-4,17
         //         */
//        Edge[] edges = new Edge[7];
//        edges[0] = new Edge(1, 2, 5);
//        edges[1] = new Edge(2, 3, 5);
//        edges[2] = new Edge(3, 5, 6);
//        edges[3] = new Edge(2, 4, 12);
//        edges[4] = new Edge(4, 5, 12);
//        edges[5] = new Edge(2, 5, 15);
//        edges[6] = new Edge(3, 4, 17);
        Edge[] edges = new Edge[8];
        edges[0] = new Edge(1, 2, 1);
        edges[1] = new Edge(2, 3, 2);
        edges[2] = new Edge(3, 4, 2);
        edges[3] = new Edge(4, 5, 3);
        edges[4] = new Edge(5, 1, 2);
        edges[5] = new Edge(1, 4, 3);
        edges[6] = new Edge(5, 2, 1);
        edges[7] = new Edge(4, 2, 2);
        //按权重排序
        Graph.sortEdge(edges);
        //打印边集合
        Graph.printEdges(edges);
        return edges;
    }


}
