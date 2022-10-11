package kw.ps.factory;

import kw.ps.Pizza;
import kw.ps.abstr.ChiesePs;
import kw.ps.abstr.JanpPs;

public class Factory{
    public Pizza create(String name){
        Pizza pizza = null;
        if (name.equals("jan")) {
            pizza = new JanpPs();
        }else if (name.equals("chinese")){
            pizza = new ChiesePs();
        }
        return pizza;
    }
}
