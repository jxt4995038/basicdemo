package cn.xibei.api.controller;

import cn.xibei.entity.Test;
import cn.xibei.mapper.TestMapper;
import cn.xibei.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * @program: basicdemo
 * @description: 测试
 * @author: jiaxiaotong
 * @create: 2018-11-09 12:16
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public void test(){
        testService.test();

        System.out.println("success");
    }
}