package cn.zwy.helloworld.behavior.template;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:15:20
 */
public abstract class HelloWorldTemplate {

    protected abstract void callHello();

    protected abstract void callWorld();

    protected abstract void callDecoration();

    public void call(){

        callDecoration();
        callHello();
        callWorld();
        callDecoration();
    }

}
