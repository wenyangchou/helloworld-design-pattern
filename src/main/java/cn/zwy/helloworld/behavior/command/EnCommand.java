package cn.zwy.helloworld.behavior.command;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:42
 */
public class EnCommand implements Command {

    private HelloWorldReceiver helloWorldReceiver;

    public EnCommand(HelloWorldReceiver helloWorldReceiver) {
        this.helloWorldReceiver = helloWorldReceiver;
    }

    @Override
    public void execute() {
        helloWorldReceiver.en();
    }
}
