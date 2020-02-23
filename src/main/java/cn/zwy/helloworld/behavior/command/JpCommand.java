package cn.zwy.helloworld.behavior.command;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:44
 */
public class JpCommand implements Command {

    private HelloWorldReceiver helloWorldReceiver;

    public JpCommand(HelloWorldReceiver helloWorldReceiver) {
        this.helloWorldReceiver = helloWorldReceiver;
    }

    @Override
    public void execute() {
        helloWorldReceiver.jp();
    }
}
