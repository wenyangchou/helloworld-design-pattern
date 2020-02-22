package cn.zwy.helloworld.structure.proxy.static_;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:04
 */
public class Main {

    public static void main(String[] args) {
        HelloWorldProxy helloWorldProxy = new HelloWorldProxy();
        CallHelloWorld cnHelloWorld = new CnHelloWorld();

        helloWorldProxy.setCallHelloWorld(cnHelloWorld);
        helloWorldProxy.call();

        CallHelloWorld enHelloWorld = new EnHelloWorld();
        helloWorldProxy.setCallHelloWorld(enHelloWorld);
        helloWorldProxy.call();
    }

}
