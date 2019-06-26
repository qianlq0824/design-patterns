package com.qianlq.factorymethod.factory;

import com.qianlq.factorymethod.object.Shape;
import com.qianlq.factorymethod.object.Square;

/**
 * @author qianliqing
 * @date 2018/11/22 2:04 PM
 * email: qianlq0824@gmail.com
 */

public class SquareFactory extends AbstractFactory {

    /**
     * 返回具体的 Square 实例
     *
     * @return
     */
    @Override
    public Shape getShape() {
        return new Square();
    }

    @Override
    public Shape getShape(String args) {
        return null;
    }

    @Override
    public Shape getShape(Object obj) {
        return null;
    }
}