package cn.zwy.helloworld.behavior.state;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:34
 */
public class HelloWorldContext {

    private HelloWorldState helloWorldState;

    public void setHelloWorldState(HelloWorldState helloWorldState){
        System.out.println("切换状态");
        this.helloWorldState = helloWorldState;
    }

    public void call(){
        this.helloWorldState.handle();
    }
}
