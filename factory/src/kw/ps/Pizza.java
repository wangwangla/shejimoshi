package kw.ps;

public abstract class Pizza {
    protected String name;
    public abstract void pre(String name);
    public void kaomianbao(){
        System.out.println(name +" 正在烤piza!!!");
    }
}
