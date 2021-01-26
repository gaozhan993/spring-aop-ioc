package cn.com.taiji.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyJDK implements InvocationHandler {

    private Object target;

    public DynamicProxyJDK(Object target){
        this.target = target;
    }

    public Object getProxy(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(target,args);
        System.out.println("after");
        return result;
    }
}
