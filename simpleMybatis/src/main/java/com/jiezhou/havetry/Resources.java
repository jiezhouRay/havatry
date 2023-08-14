package com.jiezhou.havetry;

import java.io.InputStream;

/***
 * 读取配置文件
 */
public class Resources {
    public static InputStream getResourceAsStream(String path){
        /**
         * 获取类加载器加载路径上的资源的字节流
         */
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(path);
        return resourceAsStream;
    }
}
