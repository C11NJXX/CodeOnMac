package main.java.experiment.sy52蔡英杰.sy02;

public class Experiment2 {
    public static void main(String[] args) {
        for (int x = 2; x <= 100; x++) {
            boolean isPrime=true;//用来标识每次计算的数是否是素数，如果不是则为false;
            int m = x / 2;
            for (int i = 2; i <= m; i++) {
                if (x % i == 0)
                    isPrime=false;//
                break;
            }
            if(isPrime){
                System.out.print(x+"\t");
            }
        }
    }
}
