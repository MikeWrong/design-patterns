package headfirst.designpatterns.strategy.quack;

/**
 * ½Ğ²»³öÉù
 * Created by gaozengrong on 17/2/24.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
