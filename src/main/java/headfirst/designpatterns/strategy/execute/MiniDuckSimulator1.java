package headfirst.designpatterns.strategy.execute;

import headfirst.designpatterns.strategy.duck.Duck;
import headfirst.designpatterns.strategy.duck.MallardDuck;
import headfirst.designpatterns.strategy.duck.ModelDuck;
import headfirst.designpatterns.strategy.fly.FlyRocketPowered;

/**
 * Created by gaozengrong on 17/2/24.
 */
public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
