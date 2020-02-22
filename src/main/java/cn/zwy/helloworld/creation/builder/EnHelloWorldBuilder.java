package cn.zwy.helloworld.creation.builder;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:29
 */
public class EnHelloWorldBuilder implements HelloWorldBuilder {

    private HelloWorld helloWorld;

    public EnHelloWorldBuilder() {
        this.helloWorld = new EnHelloWorld();
    }

    public void buildHello() {
        helloWorld.setHello("hello");
    }

    public void buildWorld() {
        helloWorld.setWorld("world");
    }

    public void buildDecoration() {
        helloWorld.setDecoration("==");
    }

    public HelloWorld buildHellWorld() {
        return helloWorld;
    }
}
