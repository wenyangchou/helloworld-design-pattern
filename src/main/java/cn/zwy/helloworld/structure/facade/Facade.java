package cn.zwy.helloworld.structure.facade;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:19
 */
public class Facade {

    public void call(){
        Hello hello = new Hello();
        Snow snow = new Snow();
        World world = new World();

        snow.call();
        System.out.print(" ");
        hello.call();
        System.out.print(" ");
        world.call();
        System.out.print(" ");
        snow.call();
        System.out.println();
    }
}
