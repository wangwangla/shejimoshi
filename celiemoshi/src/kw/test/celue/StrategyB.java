package kw.test.celue;

import java.util.Arrays;

/**
 * auther   kangwang
 * 2018
 */
public class StrategyB implements Strategy{
    @Override
    public double computerAverage(double[] a) {
        double sum = 0,avg = 0 ;
        Arrays.sort(a);
        for(int i= 1;i<a.length-1;i++) {
            sum+=a[i];
        }
        avg = sum /(a.length-1);
        return avg;
    }
}
