package com.tjulab.adminsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.tjulab.adminsystem") // 指定原生的servlet组件存放的位置
@SpringBootApplication
public class AdminSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminSystemApplication.class, args);
    }

}
