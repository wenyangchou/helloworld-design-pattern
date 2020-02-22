package cn.zwy.helloworld.creation.factory.simple;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:15:41
 */
public class Main {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        AbstractHelloWorld chineseHelloWorld = simpleFactory.createHelloWorld(SimpleFactory.SimpleFactoryConstant.CHINESE);
        AbstractHelloWorld englishHelloWorld = simpleFactory.createHelloWorld(SimpleFactory.SimpleFactoryConstant.ENGLISH);

        chineseHelloWorld.call();
        englishHelloWorld.call();
    }
}
