package com.jiezhou.model1;

import com.jiezhou.threadtry.model1.Meals;
import com.jiezhou.threadtry.model1.consumer.Assistants;
import com.jiezhou.threadtry.model1.provider.Cooks;
import org.junit.Test;

public class ThreadTest {
    @Test
    public void test(){
        Meals meals = new Meals();
        Thread a = new Thread(new Assistants(meals)," Assistants e");
        Thread b = new Thread(new Assistants(meals)," Assistants f");
        Thread c = new Thread(new Assistants(meals)," Assistants g");
        Thread d = new Thread(new Assistants(meals)," Assistants h");
        a.start();
        b.start();
        c.start();
        d.start();
        Thread e = new Thread(new Cooks(meals)," Cooks e");
        Thread f = new Thread(new Cooks(meals)," Cooks f");
        Thread g = new Thread(new Cooks(meals)," Cooks g");
        Thread h = new Thread(new Cooks(meals)," Cooks h");
        Thread i = new Thread(new Cooks(meals)," Cooks i");
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
    }
}
