package cn.zwy.helloworld.behavior.command;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:38
 */
public class HelloWorldReceiver {

    private String helloWorld = "hello world";

    public void en(){
        System.out.println("change to english");
        this.helloWorld = "hello world";
        call();
    }

    public void cn(){
        System.out.println("change to chinese");
        this.helloWorld = "你好世界";
        call();
    }

    public void jp(){
        System.out.println("change to japanese");
        this.helloWorld = "こんにちは、世界";
        call();
    }

    private void call(){
        System.out.println("hello world is:"+helloWorld);
    }

}
