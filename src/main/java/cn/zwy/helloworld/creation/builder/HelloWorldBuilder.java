package cn.zwy.helloworld.creation.builder;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:13
 */
public interface HelloWorldBuilder {

    void buildHello();

    void buildWorld();

    void buildDecoration();

    HelloWorld buildHellWorld();

}
