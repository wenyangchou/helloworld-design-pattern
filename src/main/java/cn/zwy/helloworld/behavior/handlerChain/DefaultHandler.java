package cn.zwy.helloworld.behavior.handlerChain;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:49
 */
public class DefaultHandler extends Handler {

    protected boolean request(String country) {
        System.out.println("no this country:"+country);
        return true;
    }
}
