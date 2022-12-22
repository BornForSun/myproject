package com.hzx.admin.layout;

import com.hzx.admin.layout.vo.Person;
import org.openjdk.jol.info.ClassLayout;

public class ThinLock {
    public static void main(String[] args)throws InterruptedException {
        Thread.sleep(5000);
        final Person p = new Person();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (p) {
                    System.out.println("thread1 locking");
                    //偏向锁
                    System.out.println(ClassLayout.parseInstance(p).toPrintable());// biased
                }
            }
        };
        thread1.start();
        thread1.join();
        Thread.sleep(10000);
        synchronized (p) {
            System.out.println("main locking");
            //轻量锁，main线程跟thread1竞争
            System.out.println(ClassLayout.parseInstance(p).toPrintable());//  thin lock
        }
    }
}
