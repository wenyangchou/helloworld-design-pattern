package cn.zwy.helloworld.structure.proxy.static_;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:02
 */
public class HelloWorldProxy implements CallHelloWorld {

    private CallHelloWorld callHelloWorld;

    public void setCallHelloWorld(CallHelloWorld callHelloWorld){
        this.callHelloWorld = callHelloWorld;
    }

    public void call() {
        System.out.println("open call");
        this.callHelloWorld.call();
        System.out.println("close call");
    }
}
