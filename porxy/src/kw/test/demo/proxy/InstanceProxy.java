package kw.test.demo.proxy;

import kw.test.demo.interf.WorkInterface;

/**
 * 代理，将目标传递出去  静态代理
 */
public class InstanceProxy {
    private WorkInterface workInterface;
    public WorkInterface getProxy(final WorkInterface workInterface){
        this.workInterface = workInterface;
        return workInterface;
    }
}
