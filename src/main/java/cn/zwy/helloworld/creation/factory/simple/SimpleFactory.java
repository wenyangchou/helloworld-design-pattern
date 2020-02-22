package cn.zwy.helloworld.creation.factory.simple;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:15:36
 */
public class SimpleFactory {

    public static class SimpleFactoryConstant{

        public static final int CHINESE = 0;

        public static final int ENGLISH = 1;
    }

    public AbstractHelloWorld createHelloWorld(int helloWorldType){
        switch (helloWorldType){
            case SimpleFactoryConstant.CHINESE:
                return new ChineseHelloWorld();
            case SimpleFactoryConstant.ENGLISH:
                return new EnglishHelloWorld();
            default:
                break;
        }
        return null;

    }
}
