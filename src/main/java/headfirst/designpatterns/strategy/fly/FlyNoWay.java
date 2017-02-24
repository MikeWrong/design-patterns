package headfirst.designpatterns.strategy.fly;

/**
 * Created by gaozengrong on 17/2/24.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
