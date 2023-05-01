package com.jiezhou.threadtry.model1.provider;

import com.jiezhou.threadtry.model1.Meals;

public class Cooks implements Runnable{

    private Meals meals;

    public Cooks(Meals meals) {
        this.meals = meals;
    }

    @Override
    public void run() {
        System.out.println("=======Cooks======");
        providerMeals();
    }


    private  void providerMeals() {
//        try {
//            Thread.currentThread().sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("providerMeals");
        meals.putMeals();
    }



}
