package cn.zwy.helloworld.structure.bridge;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:00
 */
public class Main {

    public static void main(String[] args) {
        CountryCall countryCall;

        countryCall = new ChinaCall();
        countryCall.setHelloWorld(new CnHelloWorld());
        countryCall.call();

        countryCall.setHelloWorld(new EnHelloWorld());
        countryCall.call();

        countryCall = new EnglandCall();
        countryCall.setHelloWorld(new CnHelloWorld());
        countryCall.call();

        countryCall.setHelloWorld(new EnHelloWorld());
        countryCall.call();
    }
}
