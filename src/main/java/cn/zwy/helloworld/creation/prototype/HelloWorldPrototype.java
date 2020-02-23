package cn.zwy.helloworld.creation.prototype;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:43
 */
public class HelloWorldPrototype extends Prototype {

    private String helloWorld;

    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void call(){
        System.out.println(helloWorld);
    }
}
