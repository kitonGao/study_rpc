package com.example.rpc.server.rpc;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 09:53
 */
public class ServiceGetter {

    private static Map<Class, Object> serviceMap = new HashMap<Class, Object>();

    public static <T> T getServiceByClazz(Class<T> clazz) {
        try {
            if (serviceMap.containsKey(clazz)) {
                return (T)serviceMap.get(clazz);
            } else  {
                T bean = clazz.newInstance();
                serviceMap.put(clazz, bean);
                return bean;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
