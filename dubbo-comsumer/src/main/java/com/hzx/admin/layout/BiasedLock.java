package com.hzx.admin.layout;

import com.hzx.admin.layout.vo.Person;
import org.openjdk.jol.info.ClassLayout;

public class BiasedLock {
    public static void main(String[] args) throws InterruptedException {
        // JVM 默认延时加载偏向锁。这个延时的时间大概为 4s 左右
        // 设置 JVM 参数-XX:BiasedLockingStartupDelay=0来取消延时加载偏向锁。
        Thread.sleep(5000);
        Person p = new Person();
        synchronized (p) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(ClassLayout.parseInstance(p).toPrintable());//101  biased 偏向锁
        }
    }
}
