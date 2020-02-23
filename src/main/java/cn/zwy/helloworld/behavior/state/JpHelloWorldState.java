package cn.zwy.helloworld.behavior.state;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:38
 */
public class JpHelloWorldState implements HelloWorldState {

    @Override
    public void handle() {
        System.out.println("こんにちは、世界");
    }
}
