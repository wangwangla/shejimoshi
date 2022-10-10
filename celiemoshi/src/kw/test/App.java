package kw.test;

import kw.test.celue.AverageScore;
import kw.test.celue.StrategyA;

public class App {
    public static void main(String[] args) {
        StrategyA a = new StrategyA();
        AverageScore averageScore = new AverageScore(a);
        System.out.println(averageScore.getAverageScore());
    }
}
