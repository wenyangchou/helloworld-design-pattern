package cn.zwy.helloworld.creation.builder;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:16:15
 */
public class HelloWorld {

    private String hello;

    private String world;

    private String decoration;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public void call(){
        System.out.println(this.decoration+" "+this.hello+" "+this.world+" "+this.decoration);
    }
}
