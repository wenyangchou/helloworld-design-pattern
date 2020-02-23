package cn.zwy.helloworld.behavior.state;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:37
 */
public class CnHelloWorldState implements HelloWorldState {

    @Override
    public void handle() {
        System.out.println("你好世界");
    }
}
