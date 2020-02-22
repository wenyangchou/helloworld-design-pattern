package cn.zwy.helloworld.creation.singleton.hungry;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:15:18
 */
public class HelloWorld {

    private String name;

    public String getName() {
        return name;
    }

    private HelloWorld(String name){
        this.name = name;
    }

    private static HelloWorld instance = new HelloWorld("hello world");

    public static HelloWorld getInstance(){
        return instance;
    }
}
