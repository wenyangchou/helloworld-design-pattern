package cn.zwy.helloworld.behavior.template;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:15:23
 */
public class CnHelloWorld extends HelloWorldTemplate {

    @Override
    protected void callHello() {
        System.out.print("你好");
    }

    @Override
    protected void callWorld() {
        System.out.print("世界");
    }

    @Override
    protected void callDecoration() {
        System.out.print("**");
    }
}
