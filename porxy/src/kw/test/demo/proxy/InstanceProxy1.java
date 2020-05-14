package kw.test.demo.proxy;

import kw.test.demo.impl.WorkImpl;
import kw.test.demo.interf.WorkInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InstanceProxy1 implements InvocationHandler {
    private WorkInterface invoke;
    public InstanceProxy1(final WorkInterface invoke){
        this.invoke = invoke;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object result = method.invoke(invoke, args);
        System.out.println("买房后装修");
        return result;
    }


    public static void main(String[] args) {
        WorkInterface workInterface = new WorkImpl();
        Proxy.newProxyInstance(WorkInterface.class.getClassLoader(),
                new Class[]{WorkInterface.class},
                new InstanceProxy1(workInterface));
    }
}
