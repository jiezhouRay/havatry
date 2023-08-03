package com.jiezhou.threadtry.Model3.consumer;

import com.jiezhou.threadtry.model1.Meals;

import java.util.concurrent.BlockingDeque;

public class Assistants implements Runnable {
    private BlockingDeque<Meals>  queue;

    public Assistants(BlockingDeque<Meals> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        picksUpMeals();
    }

    private void picksUpMeals(){
        try {
            queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=======picksUpMeals======"+ Thread.currentThread().getName());
    }
}
