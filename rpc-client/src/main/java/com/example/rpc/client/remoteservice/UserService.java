package com.example.rpc.client.remoteservice;

import com.example.rpc.client.rpc.RemoteClass;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 10:27
 */
@RemoteClass("com.example.rpc.server.service.UserService")
public interface UserService {

    Integer getUserCount();

    String getUserInfo(Integer id);

    Integer addUser(String name, String email, Integer age, Integer sex, String schoolName);

}
