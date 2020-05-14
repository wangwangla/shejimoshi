package kw.test.demo;

import kw.test.demo.impl.WorkImpl;
import kw.test.demo.interf.WorkInterface;
import kw.test.demo.proxy.InstanceProxy2;

public class App {
    public static void main(String[] args) {
        InstanceProxy2 j = new InstanceProxy2();
        WorkInterface instance = (WorkImpl)j.getInstance(new WorkImpl());
        instance.work();
    }
}
