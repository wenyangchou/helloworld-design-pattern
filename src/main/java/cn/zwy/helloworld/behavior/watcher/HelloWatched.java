package cn.zwy.helloworld.behavior.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * author:zwy
 * Date:2020-02-23
 * Time:15:11
 */
public class HelloWatched {

    private List<HelloWatcher> helloWatchers = new ArrayList<>();

   public void addWatcher(HelloWatcher helloWatcher){
        helloWatchers.add(helloWatcher);
    }

    public void removeWatcher(HelloWatcher helloWatcher){
       helloWatchers.remove(helloWatcher);
    }

    public void notifyAllWatcher(){
       helloWatchers.forEach(HelloWatcher::hello);
    }
}
