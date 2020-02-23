package cn.zwy.helloworld.behavior.command;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:47
 */
public class Main {

    public static void main(String[] args) {

        HelloWorldReceiver helloWorldReceiver = new HelloWorldReceiver();

        Control control = new Control(new CnCommand(helloWorldReceiver),new EnCommand(helloWorldReceiver),new JpCommand(helloWorldReceiver));

        control.cn();

        control.en();

        control.jp();

    }
}
