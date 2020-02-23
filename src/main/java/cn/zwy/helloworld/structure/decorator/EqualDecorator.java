package cn.zwy.helloworld.structure.decorator;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:55
 */
public class EqualDecorator extends Decorator {

    public EqualDecorator(IHelloWorld helloWorld) {
        super(helloWorld);
    }

    private void eq(){
        System.out.print("==");
    }

    @Override
    public void call() {
        super.call();
        eq();
    }
}
