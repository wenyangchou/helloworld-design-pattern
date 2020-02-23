package cn.zwy.helloworld.structure.decorator;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:53
 */
public class SnowDecorator extends Decorator {


    public SnowDecorator(IHelloWorld helloWorld) {
        super(helloWorld);
    }

    private void snow(){
        System.out.print("***");
    }

    @Override
    public void call() {
        super.call();
        snow();
    }
}
