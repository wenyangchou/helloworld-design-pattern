package cn.zwy.helloworld.behavior.handlerChain;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:23
 */
public class JpHandler extends Handler {

    protected boolean request(String country) {
        if (country.equals("jp")){
            System.out.println("こんにちは、世界");
            return true;
        }
        return false;
    }
}
