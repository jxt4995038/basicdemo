package cn.xibei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: basicdemo
 * @description: 启动类
 * @author: jiaxiaotong
 * @create: 2018-11-08 21:20
 */
@SpringBootApplication
@MapperScan(basePackages = "cn.xibei.mapper")
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}