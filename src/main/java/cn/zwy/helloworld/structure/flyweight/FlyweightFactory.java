package cn.zwy.helloworld.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:18:53
 */
public class FlyweightFactory {

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private static Map<String,Flyweight> map ;

    private FlyweightFactory(){

        map = new HashMap<>();
        map.put("chinese",new CnHelloWorld());
        map.put("english",new EnHelloWorld());
    }

    public static FlyweightFactory getFlyweightFactory(){
        return flyweightFactory;
    }

    public static Flyweight getFlyweight(String name){
        return map.get(name);
    }


}
