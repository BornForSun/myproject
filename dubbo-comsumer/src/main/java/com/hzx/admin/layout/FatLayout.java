package com.hzx.admin.layout;

import com.hzx.admin.layout.vo.Person;
import org.openjdk.jol.info.ClassLayout;

public class FatLayout {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        final Person p = new Person();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (p) {
                    System.out.println("thread1 locking");
                    System.out.println(ClassLayout.parseInstance(p).toPrintable());//fat lock
                    try {
                        //让线程晚点儿死亡，造成锁的竞争
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (p) {
                    System.out.println("thread2 locking");
                    System.out.println(ClassLayout.parseInstance(p).toPrintable());// fat lock
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
