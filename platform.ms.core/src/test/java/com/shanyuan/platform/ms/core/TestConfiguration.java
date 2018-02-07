package com.shanyuan.platform.ms.core;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestConfiguration {

    @Value("${test.abc}")
    private int abc ;

    public int getAbc() {
        return abc;
    }

    public void setAbc(int abc) {
        this.abc = abc;
    }
    
    @PostConstruct
    public void test() {
        System.err.println("==========="+abc);
        System.err.println("==========="+abc);
        System.err.println("==========="+abc);
        System.err.println("==========="+abc);
    }
}
