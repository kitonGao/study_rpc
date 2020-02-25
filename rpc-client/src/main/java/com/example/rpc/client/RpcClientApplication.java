package com.example.rpc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: study_rpc
 * @description:
 * @author: gaojme
 * @create: 2020-02-25 10:25
 */
@SpringBootApplication
public class RpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcClientApplication.class, args);
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
        System.out.println("RpcClient start successfully!");
        System.out.println("You can trigger RPC calls through the following interfaces:");
        System.out.println("http://127.0.0.1:12310/getUserCount");
        System.out.println("http://127.0.0.1:12310/getUserInfo");
        System.out.println("http://127.0.0.1:12310/addUser");
        System.out.println("http://127.0.0.1:12310/querySchoolName");
    }

}
