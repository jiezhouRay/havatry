package com.jiezhou.model3;


import com.jiezhou.threadtry.Model3.consumer.Assistants;
import com.jiezhou.threadtry.Model3.provider.Cooks;
import com.jiezhou.threadtry.model1.Meals;
import org.junit.Test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadTest {
    @Test
    public void test(){
        BlockingDeque quue =new LinkedBlockingDeque<Meals>(2 );
        Thread a = new Thread(new Assistants(quue)," Assistants e");
        Thread b = new Thread(new Assistants(quue)," Assistants f");
        Thread c = new Thread(new Assistants(quue)," Assistants g");
        Thread d = new Thread(new Assistants(quue)," Assistants h");
        a.start();
        b.start();
        c.start();
        d.start();
        Thread e = new Thread(new Cooks(quue)," Cooks e");
        Thread f = new Thread(new Cooks(quue)," Cooks f");
        Thread g = new Thread(new Cooks(quue)," Cooks g");
        Thread h = new Thread(new Cooks(quue)," Cooks h");
        Thread i = new Thread(new Cooks(quue)," Cooks i");
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
    }
}
