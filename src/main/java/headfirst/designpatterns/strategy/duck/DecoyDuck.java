package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyNoWay;
import headfirst.designpatterns.strategy.quack.MuteQuack;

/**
 * Created by gaozengrong on 17/2/24.
 */
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
