package cn.zwy.helloworld.behavior.command;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:43
 */
public class CnCommand implements Command {

    private HelloWorldReceiver helloWorldReceiver;

    public CnCommand(HelloWorldReceiver helloWorldReceiver) {
        this.helloWorldReceiver = helloWorldReceiver;
    }

    @Override
    public void execute() {
        helloWorldReceiver.cn();
    }
}
