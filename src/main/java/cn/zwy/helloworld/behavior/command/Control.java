package cn.zwy.helloworld.behavior.command;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:45
 */
public class Control {

    private Command cnCommand;

    private Command enCommand;

    private Command jpCommand;

    public Control(Command cnCommand, Command enCommand, Command jpCommand) {
        this.cnCommand = cnCommand;
        this.enCommand = enCommand;
        this.jpCommand = jpCommand;
    }

    public void cn(){
        cnCommand.execute();
    }

    public void en(){
        enCommand.execute();
    }

    public void jp(){
        jpCommand.execute();
    }
}
