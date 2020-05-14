package kw.test.demo.proxy;

import kw.test.demo.impl.WorkImpl;
import kw.test.demo.interf.WorkInterface;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class InstanceProxy2 implements MethodInterceptor {
    private Object target;
    public Object getInstance(final Object target){
        this.target = target;
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(this.target.getClass());
//        enhancer.setCallback(this);
        return Enhancer.create(target.getClass(),this);
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o,objects);
    }
}
