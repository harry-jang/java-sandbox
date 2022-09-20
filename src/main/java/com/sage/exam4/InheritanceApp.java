package com.sage.exam4;


import com.sage.exam4.domain.Cal;
import com.sage.exam4.domain.Cal3;

public class InheritanceApp {
    public static void maint(String[] args) {
        Cal c = new Cal(2,1);
        Cal3 c3 = new Cal3(2, 1);

        System.out.println(c3.sum());
        System.out.println(c3.minus());
    }
}
