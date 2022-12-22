package com.hzx.admin.layout;

import com.hzx.admin.layout.vo.Person;
import org.openjdk.jol.info.ClassLayout;

public class PerosonLayout {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(ClassLayout.parseInstance(p).toPrintable());//001   non-biasable 无锁且不可偏向
    }
}
