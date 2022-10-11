package kw.test.danli;

public class DoubleLockSingleton {
    private volatile DoubleLockSingleton singleton;
    private DoubleLockSingleton(){

    }

    public DoubleLockSingleton getSingleton(){
        if (singleton==null){
            synchronized (Object.class){
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
