package org.example.impl;

import org.example.Army;

public class OrcArmy implements Army {

    static final String DESCRIPTION = "This is the orc army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
