package com.qianlq.proxy.example;

import com.qianlq.proxy.object.Subject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author CoderQian
 * @date 2019-02-03 9:43 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class CglibProxy implements MethodInterceptor {

    /**
     * CGlib需要代理的目标对象
     */
    private Subject realSubject;

    public Object createProxyObject(Subject subject) {
        this.realSubject = subject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(subject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
