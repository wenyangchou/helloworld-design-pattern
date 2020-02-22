package cn.zwy.helloworld.structure.proxy.static_;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:00
 */
public class CnHelloWorld implements CallHelloWorld {

    public void call() {
        System.out.println("你好世界");
    }
}
