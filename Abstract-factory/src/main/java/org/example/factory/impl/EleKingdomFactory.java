package org.example.factory.impl;

import org.example.Army;
import org.example.Castle;
import org.example.King;
import org.example.factory.KingdomFactory;

public class EleKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
//        return new C;
        return null;
    }

    @Override
    public King createKing() {
        return null;
    }

    @Override
    public Army createArmy() {
        return null;
    }
}
