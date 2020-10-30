package com.test.strategy.duck;

public class Test {
    
    public static void main(String[] args) {
        // 绿头鸭
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuark();
        // 红头鸭
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuark();
        // 橡皮鸭
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuark();
        // 诱饵鸭
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuark();
    }
}
