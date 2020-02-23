package cn.zwy.helloworld.behavior.handlerChain;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:08
 */
public class CnHandler extends Handler {

    protected boolean request(String country) {

        if (country.equals("中国")){
            System.out.println("你好世界");
            return true;
        }

        return false;
    }
}
