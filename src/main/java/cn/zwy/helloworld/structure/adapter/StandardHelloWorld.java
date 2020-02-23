package cn.zwy.helloworld.structure.adapter;

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
