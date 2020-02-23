package cn.zwy.helloworld.behavior.adapter;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:06
 */
public class HelloWorldAdaptee extends Adaptee{

    @Override
    public void hello() {
        System.out.print("hello");
    }

    @Override
    public void world() {
        System.out.print("hello");
    }
}
