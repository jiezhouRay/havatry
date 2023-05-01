package com.jiezhou.threadtry.model1.provider;

public class Cooks implements Runnable{
    private static boolean canGetMeals =false;

    @Override
    public void run() {
        System.out.println("=======Cooks======");
        providerMeals();
    }


    private synchronized void providerMeals() {
        try {
        //    Thread.currentThread().sleep(1000);
            System.out.println("线程:"+Thread.currentThread().getName()+"准备好了,请取餐");
            this.canGetMeals =true;
            notifyAll();
        } catch (Exception e) {
           System.out.println("线程异常 Cooks:"+ e);
        }
    }

    public synchronized boolean isGetMeals(){
        while(!canGetMeals){
            try {
                wait();
            } catch (InterruptedException e) {
              System.out.println("线程等待异常");
            }
        }
        return canGetMeals;
    }

}
