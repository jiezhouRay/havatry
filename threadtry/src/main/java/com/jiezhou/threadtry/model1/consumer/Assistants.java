package com.jiezhou.threadtry.model1.consumer;

import com.jiezhou.threadtry.model1.provider.Cooks;

public class Assistants implements Runnable {

    @Override
    public void run() {
        Cooks cooks = new Cooks();
        while (cooks.isGetMeals()) {
            picksUpMeals();
        }
    }

    private void picksUpMeals() {
        System.out.println("当前线程:" + Thread.currentThread().getName() + "已取餐");
    }
}
