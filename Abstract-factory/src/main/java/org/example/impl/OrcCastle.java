package org.example.impl;

import org.example.Castle;

public class OrcCastle implements Castle {
    static final String DESCRIPTION = "This is the orc Castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
