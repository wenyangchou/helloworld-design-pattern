package cn.zwy.helloworld.creation.prototype;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:17:41
 */
public class Prototype implements Cloneable {

    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
