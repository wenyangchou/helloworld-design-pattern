package cn.zwy.helloworld.creation.builder;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:32
 */
public class Main {

    public static void main(String[] args) {
        HelloWorldDirector helloWorldDirector = new HelloWorldDirector();
        HelloWorldBuilder cnHelloWorldBuilder = new CnHelloWorldBuilder();
        HelloWorld cnHelloWorld = helloWorldDirector.build(cnHelloWorldBuilder);
        cnHelloWorld.call();

        HelloWorldBuilder enHelloWorldBuilder = new EnHelloWorldBuilder();
        HelloWorld enHelloWorld = helloWorldDirector.build(enHelloWorldBuilder);
        enHelloWorld.call();
    }
}
