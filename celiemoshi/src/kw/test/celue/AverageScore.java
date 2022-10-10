package kw.test.celue;

/**
 * auther   kangwang
 * 2018 计算平均值
 */
public class AverageScore {
    Strategy strategy ;
    double []a;
    public AverageScore(Strategy strategy){
        a = new double[100];
        for (int i= 0; i < a.length; i++) {
            a[i] = i;
        }
        this.strategy = strategy ;
    }
    public double getAverageScore(){
        if(strategy != null){
            return strategy.computerAverage(a);
        }
        else {
            System.out.print("没有数据！");
            return -1;
        }
    }
}
