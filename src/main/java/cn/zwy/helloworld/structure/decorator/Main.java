package cn.zwy.helloworld.structure.decorator;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:57
 */
public class Main {

    public static void main(String[] args) {
        IHelloWorld helloWorld = new HelloWorld();
        Decorator decorator = new SnowDecorator(new SnowDecorator(new WhyDecorator(new EqualDecorator(helloWorld))));
        decorator.call();
    }
}
