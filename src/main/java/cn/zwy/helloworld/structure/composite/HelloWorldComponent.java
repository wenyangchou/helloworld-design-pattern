package cn.zwy.helloworld.structure.composite;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:25
 */
public abstract class HelloWorldComponent {

    protected String name;

    public HelloWorldComponent(String name) {
        this.name = name;
    }

    public abstract void addComponent(HelloWorldComponent helloWorldComponent);

    public abstract void removeComponent(HelloWorldComponent helloWorldComponent);

    public abstract void call();
}
