package com.sage.exam4.domain;

public class Cal {
    int v1, v2;

    public Cal (int v1, int v2){
        System.out.println("Cal init!!");
        this.v1 = v1;
        this.v2 = v2;

    }

    public int sum() {
        return this.v1 + this.v2;
    }
}
