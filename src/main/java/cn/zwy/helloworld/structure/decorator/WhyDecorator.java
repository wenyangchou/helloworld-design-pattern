package cn.zwy.helloworld.structure.decorator;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:56
 */
public class WhyDecorator extends Decorator {

    public WhyDecorator(IHelloWorld helloWorld) {
        super(helloWorld);
    }

    private void why(){
        System.out.print("??");
    }

    @Override
    public void call() {
        super.call();
        why();
    }
}
