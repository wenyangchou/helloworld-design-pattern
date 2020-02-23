package cn.zwy.helloworld.behavior.handlerChain;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:22
 */
public class EnHandler extends Handler {

    protected boolean request(String country) {

        if (country.equals("english")){
            System.out.println("hello world");
            return true;
        }
        return false;
    }
}
