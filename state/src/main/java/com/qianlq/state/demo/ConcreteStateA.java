package com.qianlq.state.demo;

/**
 * @author CoderQian
 * @version v1.0
 * @date 2020/5/6
 */

public class ConcreteStateA extends State {

    @Override
    public void handle() {
        // do something
        System.out.println("A do something.");
    }
}
