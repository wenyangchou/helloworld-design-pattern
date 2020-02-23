package cn.zwy.helloworld.structure.adapter;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:08
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("原生hello world，不需要适配");
        TargetHelloWorld standardHelloWorld = new StandardHelloWorld();
        standardHelloWorld.call();

        System.out.println("非原生、非标准hello world");
        TargetHelloWorld unstandardHelloWorld = new StandardAdapter(new HelloWorldAdaptee());
        unstandardHelloWorld.call();
    }
}
