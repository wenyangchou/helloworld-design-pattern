package cn.zwy.helloworld.structure.composite;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:34
 */
public class Main {

    public static void main(String[] args) {

        LeafComponent helloComponent = new LeafComponent("hello");
        LeafComponent spaceComponent = new LeafComponent(" ");
        LeafComponent worldComponent = new LeafComponent("world");

        Composite composite = new Composite("组合器");
        composite.addComponent(helloComponent);
        composite.addComponent(spaceComponent);
        composite.addComponent(worldComponent);
        composite.call();

    }
}
