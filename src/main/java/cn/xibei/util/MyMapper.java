package cn.xibei.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @program: basicdemo
 * @description: 通用Mapper
 * @author: jiaxiaotong
 * @create: 2018-11-15 10:30
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}