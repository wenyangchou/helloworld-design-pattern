package cn.zwy.helloworld.structure.bridge;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:13:55
 */
public class ChinaCall extends CountryCall {

    public void call() {
        System.out.println("我在中国,"+this.helloWorld.name());
    }
}
