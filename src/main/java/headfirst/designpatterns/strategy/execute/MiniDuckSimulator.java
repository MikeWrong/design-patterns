package headfirst.designpatterns.strategy.execute;

import headfirst.designpatterns.strategy.duck.*;
import headfirst.designpatterns.strategy.fly.FlyRocketPowered;

/**
 * Created by gaozengrong on 17/2/24.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
