package kw.ps.abstr;

import kw.ps.Pizza;

public class JanpPs extends Pizza {
    public JanpPs(){
        pre("jan");
    }

    @Override
    public void pre(String name) {
        this.name = name;
    }
}
