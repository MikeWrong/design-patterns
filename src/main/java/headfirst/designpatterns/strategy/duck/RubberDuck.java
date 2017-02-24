package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyNoWay;
import headfirst.designpatterns.strategy.quack.Squeak;

/**
 * ÏðÆ¤Ñ¼
 * Created by gaozengrong on 17/2/24.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
