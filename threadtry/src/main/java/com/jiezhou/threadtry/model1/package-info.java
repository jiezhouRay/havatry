package com.jiezhou.threadtry.model1;
/**
 * 开发中问题整理
 *
 * 1.使用 wait()方法报错
 *   简单的来说，当你在调用notify(), notifyAll(),wait(), wait(long), wait(long, int)等线程控制操作方法时，
 *   必须要有两个前提。
 *   第一：必须要在被synchronized关键字控制的同步代码块中，才能调用这些方法。
 *   第二，调用者必须为你当前的锁对象。
 *
 * 2.wait()被唤醒后，会继续执行wait()后的程序
 *
 * 3 wait 要使用同步锁 （锁最好是共享资源）
 */