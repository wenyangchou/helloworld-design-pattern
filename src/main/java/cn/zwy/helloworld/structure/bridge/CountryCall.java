package cn.zwy.helloworld.structure.bridge;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:13:53
 */
public abstract class CountryCall {

    protected HelloWorld helloWorld;


    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public abstract void call();
}
