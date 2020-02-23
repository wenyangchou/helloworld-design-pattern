package cn.zwy.helloworld.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:30
 */
public class Composite extends HelloWorldComponent {


    private List<HelloWorldComponent> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void addComponent(HelloWorldComponent helloWorldComponent) {
        components.add(helloWorldComponent);
    }

    @Override
    public void removeComponent(HelloWorldComponent helloWorldComponent) {
        components.remove(helloWorldComponent);
    }

    @Override
    public void call() {
        components.forEach(HelloWorldComponent::call);
    }
}
