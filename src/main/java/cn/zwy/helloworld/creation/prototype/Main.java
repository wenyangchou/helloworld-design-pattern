package cn.zwy.helloworld.creation.prototype;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:43
 */
public class Main {

    public static void main(String[] args) {
        HelloWorldPrototype helloWorldPrototype = new HelloWorldPrototype();
        helloWorldPrototype.setHelloWorld("hello world");
        helloWorldPrototype.call();

        HelloWorldPrototype newHelloWorld = (HelloWorldPrototype) helloWorldPrototype.clone();
        newHelloWorld.call();
    }
}
