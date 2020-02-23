package cn.zwy.helloworld.behavior.adapter;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:05
 */
public class StandardHelloWorld implements TargetHelloWorld {

    @Override
    public void call() {
        System.out.println("hello world");
    }
}
