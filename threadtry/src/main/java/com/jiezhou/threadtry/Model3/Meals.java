package com.jiezhou.threadtry.Model3;

public class Meals {
    private boolean isHaveMeals = false;

    public synchronized void putMeals() {
        System.out.println("putMeals " + Thread.currentThread().getName());

        while (isHaveMeals) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        isHaveMeals = true;
        notifyAll();
        System.out.println("备餐，好了" + isHaveMeals + Thread.currentThread().getName());

    }

    public synchronized void getMeals(){
        System.out.println("getMeals "+Thread.currentThread().getName());
        while(!isHaveMeals){//有任务
            try {
                System.out.println("getMeals 2222222222");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
        isHaveMeals =false;
        System.out.println("已取餐"+ isHaveMeals +Thread.currentThread().getName());
        notifyAll();

    }
}
