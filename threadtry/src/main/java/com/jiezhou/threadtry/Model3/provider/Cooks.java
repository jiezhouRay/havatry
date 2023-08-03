package com.jiezhou.threadtry.Model3.provider;

import com.jiezhou.threadtry.model1.Meals;

import java.util.concurrent.BlockingDeque;

public class Cooks implements Runnable{
    private BlockingDeque<Meals> queue;


    public Cooks(BlockingDeque<Meals> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("=======Cooks======");
        providerMeals();
    }


    private  void providerMeals() {

        queue.addLast(new Meals());
        System.out.println("providerMeals"+ Thread.currentThread().getName());
    }



}
