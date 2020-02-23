package cn.zwy.helloworld.behavior.template;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:15:23
 */
public class EnHelloWorld extends HelloWorldTemplate {

    @Override
    protected void callHello() {
        System.out.print("hello");
    }

    @Override
    protected void callWorld() {
        System.out.print("world");
    }

    @Override
    protected void callDecoration() {
        System.out.print("==");
    }
}
