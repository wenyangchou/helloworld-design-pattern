package cn.zwy.helloworld.creation.singleton.hungry;

/**
 * author:zwy
 * Date:2020-02-22
 * Time:15:19
 */
public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld1 = HelloWorld.getInstance();
        HelloWorld helloWorld2 = HelloWorld.getInstance();

        System.out.println(helloWorld1==helloWorld2);
        if (helloWorld1==helloWorld2){
            System.out.println("是同一个对象");
        }
        System.out.println(helloWorld1.getName());
        System.out.println(helloWorld2.getName());

    }
}
