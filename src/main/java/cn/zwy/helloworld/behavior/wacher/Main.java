package cn.zwy.helloworld.behavior.wacher;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:15:15
 */
public class Main {

    public static void main(String[] args) {
        HelloWatched helloWatched = new HelloWatched();

        HelloWatcher enWatcher = new EnWatcher();
        HelloWatcher cnWatcher = new CnWatcher();

        helloWatched.addWatcher(cnWatcher);
        helloWatched.addWatcher(enWatcher);

        System.out.println("hello");
        helloWatched.notifyAllWatcher();

    }
}
