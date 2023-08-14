package com.jiezhou.mywork;

import com.jiezhou.havetry.Resources;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {
    @Test
    public void resourceTest(){
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        System.out.println(resourceAsStream);
    }
}
