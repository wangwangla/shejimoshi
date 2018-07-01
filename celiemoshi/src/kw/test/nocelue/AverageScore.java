package kw.test.nocelue;

/**
 * auther   kangwang
 * 2018策略模式练习
 *
 * 计算所有数据的平均值
 *
 * 问题：只可以满足一个问题的答案，不可以满足多个问题的答案。
 * 这种方法是不合理的。
 */
public class AverageScore {
    public double cimputerAverage(double[] a){
        double sum = 0,avg = 0 ;
        for(int i= 0;i<a.length;i++) {
            sum+=a[i];
        }
        avg = sum /a.length;
        return avg;
    }
}
