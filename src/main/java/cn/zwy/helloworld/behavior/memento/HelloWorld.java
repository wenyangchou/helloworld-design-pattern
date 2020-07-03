package cn.zwy.helloworld.behavior.memento;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:19:15
 */
public class HelloWorld {

    private String name;

    public Memento createMemeto(){
        return new Memento(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void restore(Memento memento){
        this.name = memento.getName();
    }
}
