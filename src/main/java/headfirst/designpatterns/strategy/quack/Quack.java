package headfirst.designpatterns.strategy.quack;

/**
 * ���ɽ�
 * Created by gaozengrong on 17/2/24.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
