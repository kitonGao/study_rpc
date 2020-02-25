package com.example.rpc.client.rpc;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 10:27
 */
public class ServiceProxy<T> implements InvocationHandler {

    private T target;

    public ServiceProxy(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RemoteClass remoteClass = method.getDeclaringClass().getAnnotation(RemoteClass.class);
        if (remoteClass == null) {
            throw new Exception("远程类标志未指定");
        }

        List<String> argTypeList = new ArrayList<String>();
        if (args != null ) {
            for (Object obj : args) {
                argTypeList.add(obj.getClass().getName());
            }
        }

        String argTypes = JSON.toJSONString(argTypeList);
        String argValues = JSON.toJSONString(args);


        Result result = HttpUtil.callRemoteService(remoteClass.value(), method.getName(), argTypes, argValues);

        if (result.isSuccess()) {
            return JSON.parseObject(result.getResultValue(), Class.forName(result.getResultType()));
        } else {
            throw new Exception("远程调用失败："+ result.getMessage());
        }
    }


}
