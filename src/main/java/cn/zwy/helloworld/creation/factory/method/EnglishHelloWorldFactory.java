package cn.zwy.helloworld.creation.factory.method;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:15:48
 */
public class EnglishHelloWorldFactory implements IHelloWorldFactory {

    public AbstractHelloWorld createHelloWorld() {
        return new EnglishHelloWorld();
    }
}
