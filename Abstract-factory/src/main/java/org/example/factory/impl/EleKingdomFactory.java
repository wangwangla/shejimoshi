package org.example.factory.impl;

import org.example.Army;
import org.example.Castle;
import org.example.King;
import org.example.factory.KingdomFactory;
import org.example.impl.ElfArmy;
import org.example.impl.ElfCastle;
import org.example.impl.ElfKing;

public class EleKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
//        return new C;
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
