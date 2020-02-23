package cn.zwy.helloworld.structure.flyweight;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:19:03
 */
public class Main {

    public static void main(String[] args) {

        Flyweight cnHelloWorld = FlyweightFactory.getFlyweight("chinese");

        Flyweight enHelloWorld = FlyweightFactory.getFlyweight("english");

        Flyweight cnHelloWorld2 = FlyweightFactory.getFlyweight("chinese");

        cnHelloWorld.call();
        enHelloWorld.call();

        System.out.println(cnHelloWorld==cnHelloWorld2);


    }
}
