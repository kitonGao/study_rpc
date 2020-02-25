package com.example.rpc.client.rpc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 10:31
 */
public class ServiceFactory<T> implements FactoryBean<T> {

    private Class<T> interfaceType;

    public ServiceFactory(Class<T> interfaceType) {
        this.interfaceType = interfaceType;
    }



    @Nullable
    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = new ServiceProxy<Class>(interfaceType);
        return (T)Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler);
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return interfaceType;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
