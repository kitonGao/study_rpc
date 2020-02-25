package com.example.rpc.client.remoteservice;

import com.example.rpc.client.rpc.RemoteClass;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 10:27
 */
@RemoteClass("com.example.rpc.server.service.SchoolService")
public interface SchoolService {
    String querySchoolName(Integer id);
}
