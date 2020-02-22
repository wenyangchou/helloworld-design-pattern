package cn.zwy.helloworld.creation.builder;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:31
 */
public class HelloWorldDirector {

    public HelloWorld build(HelloWorldBuilder helloWorldBuilder){
        helloWorldBuilder.buildHello();
        helloWorldBuilder.buildWorld();
        helloWorldBuilder.buildDecoration();
        return helloWorldBuilder.buildHellWorld();
    }
}
