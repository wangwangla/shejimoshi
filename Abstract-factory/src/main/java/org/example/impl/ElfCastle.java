package org.example.impl;

import org.example.Castle;

public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the elven castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
