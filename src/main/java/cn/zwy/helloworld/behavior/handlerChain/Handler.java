package cn.zwy.helloworld.behavior.handlerChain;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:14:06
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected abstract boolean request(String country);

    public void handleRequest(String country){

        Handler handler = this;

        while (handler!=null && !handler.request(country)){
            System.out.println(handler);
            handler = handler.successor;
        }


    }

}
