package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyNoWay;
import headfirst.designpatterns.strategy.quack.Quack;

/**
 * Ä£ÐÍÑ¼
 * Created by gaozengrong on 17/2/24.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
