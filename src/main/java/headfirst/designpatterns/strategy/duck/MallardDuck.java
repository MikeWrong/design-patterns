package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyWithWings;
import headfirst.designpatterns.strategy.quack.Quack;

/**
 * ÂÌÍ·Ñ¼
 * Created by gaozengrong on 17/2/24.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
