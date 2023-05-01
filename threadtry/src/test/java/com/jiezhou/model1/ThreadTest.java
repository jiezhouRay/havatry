package com.jiezhou.model1;

import com.jiezhou.threadtry.model1.consumer.Assistants;
import com.jiezhou.threadtry.model1.provider.Cooks;
import org.junit.Test;

public class ThreadTest {
    @Test
    public void test(){
        Thread a = new Thread(new Assistants());
//        Thread b = new Thread(new Assistants());
//        Thread c = new Thread(new Assistants());
//        Thread d = new Thread(new Assistants());
        a.start();
//        b.start();
//        c.start();
//        d.start();
        Thread e = new Thread(new Cooks());
//        Thread f = new Thread(new Cooks());
//        Thread g = new Thread(new Cooks());
//        Thread h = new Thread(new Cooks());
//        Thread i = new Thread(new Cooks());
        e.start();
//        f.start();
//        g.start();
//        h.start();
//        i.start();
    }
}
