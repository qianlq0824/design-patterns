package com.qianlq.proxy.example;

import com.qianlq.proxy.object.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author CoderQian
 * @date 2019-02-03 9:20 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class JdkProxy implements InvocationHandler {

    private Subject realSubject;

    public Subject newProxy(Subject realSubject) {
        // 将目标对象传入进行代理
        this.realSubject = realSubject;
        // 返回代理对象
        return (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        Object obj;
        if ("request".equals(method.getName())) {
            obj = method.invoke(realSubject, args);
            System.out.println("调用request方法");
        } else {
            obj = method.invoke(realSubject, args);
            System.out.println("调用其它方法");
        }
        return obj;
    }
}
