package cn.qianlq.facade;

import cn.qianlq.facade.object.ShapeMaker;

/**
 * @author qianliqing
 * @date 2018-11-18 8:44 PM
 * mail: qianlq0824@gmail.com
 */

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
