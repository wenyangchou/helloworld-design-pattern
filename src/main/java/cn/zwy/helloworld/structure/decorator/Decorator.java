package cn.zwy.helloworld.structure.decorator;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:52
 */
public abstract class Decorator implements IHelloWorld {

    private IHelloWorld helloWorld;

    public Decorator(IHelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public void call() {
        this.helloWorld.call();
    }
}
