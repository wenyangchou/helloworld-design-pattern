package cn.zwy.helloworld.behavior.stategy;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:08
 */
public class EnHelloWorldStrategy implements IHelloWorldStrategy {

    public void call() {
        System.out.println("hello world");
    }
}
