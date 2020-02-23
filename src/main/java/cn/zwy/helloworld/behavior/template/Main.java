package cn.zwy.helloworld.behavior.template;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:15:25
 */
public class Main {

    public static void main(String[] args) {
        HelloWorldTemplate cnHelloWorld = new CnHelloWorld();
        HelloWorldTemplate enHelloWorld = new EnHelloWorld();

        cnHelloWorld.call();
        System.out.println();
        enHelloWorld.call();

    }
}
