package com.example.rpc.server;

import com.alibaba.fastjson.JSON;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 09:50
 */
@SpringBootApplication
public class RPCServcerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RPCServcerApplication.class, args);
        System.out.println("*************************************************");
        System.out.println(" ______                _____  _____   _____ \n" +
                "|  ____|              |  __ \\|  __ \\ / ____|\n" +
                "| |__   __ _ ___ _   _| |__) | |__) | |     \n" +
                "|  __| / _` / __| | | |  _  /|  ___/| |     \n" +
                "| |___| (_| \\__ \\ |_| | | \\ \\| |    | |____ \n" +
                "|______\\__,_|___/\\__, |_|  \\_\\_|     \\_____|\n" +
                "                  __/ |                     \n" +
                "                 |___/                      \n");
        System.out.println("*************************************************");
        System.out.println("RpcServer start successfully!");
        System.out.println("Ready to receive RpcClient call.");

    }





}
