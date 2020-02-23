package cn.zwy.helloworld.structure.decorator;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:16:57
 */
public class HelloWorld implements IHelloWorld {

    @Override
    public void call() {
        System.out.print("hello");
    }
}
