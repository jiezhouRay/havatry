package com.jiezhou.havetry;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream in){
        // 第一步: 使用dom4j 解析配置文件，将解析出的内容封装到Configuration中
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder();
        xmlConfigBuilder.parseConfig(in);e
        // 第二步: 创建sqlSession
    }
}
