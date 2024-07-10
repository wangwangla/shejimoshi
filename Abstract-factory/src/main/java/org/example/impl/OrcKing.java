package org.example.impl;

import org.example.King;

public class OrcKing implements King {

    static final String DESCRIPTION = "This is the orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
