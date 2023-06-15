package main.java.experiment.sy52蔡英杰.lssy02;

public class Warshall {
    public static void main(String[] args) {
        //初始化矩阵
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = 0;//先讲所有元素设置为 0，再具体添加测试
            }
        }
        arr[0][1] = 1;
        arr[1][2] = 1;
        arr[1][3] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[3][0] = 1;
        printArr(arr);

        //warshall算法
        int count = 0;
        //循环每一行
        for (int i = 0; i < 4; i++) {
            //看第 i 列哪些元素为 1
            for (int j = 0; j < 4; j++) {
                if (arr[j][i] == 1) {
                    //第 j 行 i 列的元素为 1
                    //把第 i 行的所有元素逻辑加到第 j 行
                    for (int s = 0; s < 4; s++) {
                        arr[j][s] = (arr[j][s] + arr[i][s]) == 0 ? 0 : 1;//利用三目运算符
                    }
                }
            }
            count++;
            //每循环一行打印一次矩阵
            System.out.println("\n----------第" + count + "次-----------\n");
            printArr(arr);
        }
    }

    public static void printArr(int[][] arr) {
        int count = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (count == 4) {
                    System.out.println("\n");
                    count = 0;
                }
                System.out.print(j + " ");
                count++;
            }
        }
    }
}
