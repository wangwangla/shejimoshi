package kw.test.celue;

/**
 * auther   kangwang
 * 2018 计算平均值
 */
public class AverageScore {
    Strategy strategy ;
    double []a;
    public AverageScore(Strategy strategy){
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
