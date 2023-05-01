package com.jiezhou.threadtry.model1.consumer;

import com.jiezhou.threadtry.model1.Meals;

public class Assistants implements Runnable {

    private Meals meals;

    public Assistants(Meals meals) {
        this.meals = meals;
    }

    @Override
    public void run() {
        System.out.println("=======picksUpMeals======");
        picksUpMeals();
    }

    private void picksUpMeals() {
         meals.getMeals();
    }
}
