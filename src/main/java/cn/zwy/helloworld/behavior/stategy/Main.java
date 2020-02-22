package cn.zwy.helloworld.behavior.stategy;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:09
 */
public class Main {

    public static void main(String[] args) {

        IHelloWorldStrategy helloWorldStrategy;

        System.out.println("当我在中国:");
        helloWorldStrategy = new CnHelloWorldStrategy();
        helloWorldStrategy.call();

        System.out.println("=================");

        System.out.println("当我在大不列颠帝国:");
        helloWorldStrategy = new EnHelloWorldStrategy();
        helloWorldStrategy.call();

    }
}
