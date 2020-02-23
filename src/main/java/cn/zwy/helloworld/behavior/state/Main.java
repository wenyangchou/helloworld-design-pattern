package cn.zwy.helloworld.behavior.state;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:39
 */
public class Main {

    public static void main(String[] args) {
        HelloWorldContext helloWorldContext = new HelloWorldContext();

        HelloWorldState cnState = new CnHelloWorldState();
        HelloWorldState enState = new EnHelloWorldState();
        HelloWorldState jpState = new JpHelloWorldState();

        System.out.println("在中国");
        helloWorldContext.setHelloWorldState(cnState);

        System.out.println("在日本");
        helloWorldContext.setHelloWorldState(jpState);

        System.out.println("回到中国");
        helloWorldContext.setHelloWorldState(cnState);

        System.out.println("在英国");
        helloWorldContext.setHelloWorldState(enState);
    }
}
