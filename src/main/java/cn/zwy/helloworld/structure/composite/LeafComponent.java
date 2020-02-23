package cn.zwy.helloworld.structure.composite;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:30
 */
public class LeafComponent extends HelloWorldComponent {

    public LeafComponent(String name) {
        super(name);
    }

    @Override
    public void addComponent(HelloWorldComponent helloWorldComponent) {

    }

    @Override
    public void removeComponent(HelloWorldComponent helloWorldComponent) {

    }

    @Override
    public void call() {
        System.out.print(name);
    }
}
