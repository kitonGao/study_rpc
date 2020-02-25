package com.example.rpc.server.service;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 09:52
 */
public class SchoolService {

    public String querySchoolName(Integer id) {
        System.out.println("查询SchoolService.querySchoolName方法");
        System.out.println("查询条件 id ="+ id );
        return "School";
    }


}
