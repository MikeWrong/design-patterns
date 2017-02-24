package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyWithWings;
import headfirst.designpatterns.strategy.quack.Quack;

/**
 * ºìÍ·Ñ¼
 * Created by gaozengrong on 17/2/24.
 */
public class ReadHeadDuck extends Duck{
    public ReadHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
