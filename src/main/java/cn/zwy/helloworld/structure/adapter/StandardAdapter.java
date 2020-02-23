package cn.zwy.helloworld.structure.adapter;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:07
 */
public class StandardAdapter implements TargetHelloWorld {

    private Adaptee adaptee;

    public StandardAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;

    }

    @Override
    public void call() {
        System.out.println("进行适配调整");
        adaptee.hello();
        System.out.print(" ");
        adaptee.world();
    }
}
