package cn.qianlq.decorator;

import cn.qianlq.decorator.object.Circle;
import cn.qianlq.decorator.object.Rectangle;
import cn.qianlq.decorator.object.RedShapeDecorator;
import cn.qianlq.decorator.object.Shape;

/**
 * @author qianliqing
 * @date 2018-10-02 下午8:24
 * mail: qianlq0824@gmail.com
 */

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
