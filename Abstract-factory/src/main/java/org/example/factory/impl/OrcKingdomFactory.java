package org.example.factory.impl;

import org.example.Army;
import org.example.Castle;
import org.example.King;
import org.example.factory.KingdomFactory;
import org.example.impl.ElfArmy;
import org.example.impl.OrcArmy;
import org.example.impl.OrcCastle;
import org.example.impl.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
