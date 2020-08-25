/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author sarun
 */
//public interface MyObserver  {
//    public void update(Source o);
//}
public class MyObserver extends Observable {
    private int a;
    public void setSomeData(int val) {
        a = val;
        setChanged();
        notifyObservers();
    }
    public int getSomeData() {
        return a;
    }   
}