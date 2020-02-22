package cn.zwy.helloworld.creation.factory.method;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:15:48
 */
public class Main {

    public static void main(String[] args) {
        IHelloWorldFactory chineseFactory = new ChineseHelloWorldFactory();
        AbstractHelloWorld chineseHelloWorld = chineseFactory.createHelloWorld();

        IHelloWorldFactory englishFactory = new EnglishHelloWorldFactory();
        AbstractHelloWorld englishHelloWorld = englishFactory.createHelloWorld();

        chineseHelloWorld.call();
        englishHelloWorld.call();

    }
}
