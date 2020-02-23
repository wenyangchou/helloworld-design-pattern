package cn.zwy.helloworld.behavior.state;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:39
 */
public class EnHelloWorldState implements HelloWorldState {

    @Override
    public void handle() {
        System.out.println("hello world");
    }
}
