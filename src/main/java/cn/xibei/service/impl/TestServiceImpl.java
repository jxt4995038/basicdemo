package cn.xibei.service.impl;

import cn.xibei.entity.Test;
import cn.xibei.mapper.TestMapper;
import cn.xibei.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: basicdemo
 * @description:
 * @author: jiaxiaotong
 * @create: 2018-11-15 17:42
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public void test() {
        Test test = new Test();
        test.setName("fdsa");
        testMapper.insert(test);
    }
}