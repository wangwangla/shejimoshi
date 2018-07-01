package kw.test.celue;

/**
 * auther   kangwang
 */
public class StrategyA implements Strategy{
    @Override
    public double computerAverage(double[] a) {
        double sum = 0,avg = 0 ;
        for(int i= 0;i<a.length;i++) {
            sum+=a[i];
        }
        avg = sum /a.length;
        return avg;
    }
}
