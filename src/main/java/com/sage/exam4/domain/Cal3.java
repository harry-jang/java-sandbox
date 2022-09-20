package com.sage.exam4.domain;

public class Cal3 extends Cal{
    public Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init!!!");
    }

    public int minus() {
        return this.v1 - this.v2;
    }
}
