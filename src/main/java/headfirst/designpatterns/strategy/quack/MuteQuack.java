package headfirst.designpatterns.strategy.quack;

/**
 * �в�����
 * Created by gaozengrong on 17/2/24.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
