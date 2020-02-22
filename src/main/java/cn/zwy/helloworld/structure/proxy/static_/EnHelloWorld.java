package cn.zwy.helloworld.structure.proxy.static_;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:01
 */
public class EnHelloWorld implements CallHelloWorld {

    public void call() {
        System.out.println("hello world");
    }
}
