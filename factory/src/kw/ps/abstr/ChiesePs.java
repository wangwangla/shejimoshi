package kw.ps.abstr;

import kw.ps.Pizza;

public class ChiesePs extends Pizza {
    public ChiesePs(){
        pre("chinese");
    }

    @Override
    public void pre(String name) {
        this.name = name;
    }
}
