package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.fly.FlyBehavior;
import headfirst.designpatterns.strategy.quack.QuackBehavior;

/**
 * Created by gaozengrong on 17/2/24.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
