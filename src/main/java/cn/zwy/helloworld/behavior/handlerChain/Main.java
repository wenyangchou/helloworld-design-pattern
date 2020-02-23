package cn.zwy.helloworld.behavior.handlerChain;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:24
 */
public class Main {

    public static void main(String[] args) {

        String country = "englishs";

        Handler cnHandler = new CnHandler();
        Handler enHandler = new EnHandler();
        Handler jpHandler = new JpHandler();
        Handler defaultHandler = new DefaultHandler();

        cnHandler.setSuccessor(enHandler);
        enHandler.setSuccessor(jpHandler);
        jpHandler.setSuccessor(defaultHandler);

        cnHandler.handleRequest(country);

    }
}
