package cn.zwy.helloworld.creation.builder;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:23
 */
public class CnHelloWorldBuilder implements HelloWorldBuilder {

    private HelloWorld helloWorld;

    public CnHelloWorldBuilder() {
        this.helloWorld = new CnHelloWorld();
    }

    public void buildHello() {
        helloWorld.setHello("你好");
    }

    public void buildWorld() {
        helloWorld.setWorld("世界");
    }

    public void buildDecoration() {
        helloWorld.setDecoration("**");
    }

    public HelloWorld buildHellWorld() {
        return helloWorld;
    }
}
