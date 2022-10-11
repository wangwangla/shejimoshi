package kw.test.danli;

public class WeiSinglton {
    private WeiSinglton(){ }
    private static WeiSinglton weiSinglton;
    public static WeiSinglton getInstance(){
        if (weiSinglton == null){
            synchronized (Object.class){
                weiSinglton  = new WeiSinglton();
            }
        }
        return weiSinglton;
    }
}
