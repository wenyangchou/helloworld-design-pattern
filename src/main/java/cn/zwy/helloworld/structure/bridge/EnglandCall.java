package cn.zwy.helloworld.structure.bridge;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:13:59
 */
public class EnglandCall  extends CountryCall{

    public void call() {
        System.out.println("I am in england,"+this.helloWorld.name());
    }
}
