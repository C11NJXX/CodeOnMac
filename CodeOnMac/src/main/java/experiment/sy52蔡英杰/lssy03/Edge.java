package main.java.experiment.sy52蔡英杰.lssy03;

public class Edge {
    public int point1;
    public int point2;
    public int weight;

    public boolean isAdd;

    public Edge(int point1, int point2, int weight) {
        this.point1 = point1;
        this.point2 = point2;
        this.weight = weight;
        isAdd = false;
    }

    public Edge() {
        this.point1 = 0;
        this.point2 = 0;
        this.weight = 0;
        isAdd = false;
    }

    @Override
    public String toString() {
        return new String("point1 : " + point1 + " point2 : " + point2 + " weight = " + weight);
    }

    public int getWeight() {
        return weight;
    }

}
