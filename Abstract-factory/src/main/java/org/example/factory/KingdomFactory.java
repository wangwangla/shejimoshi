package org.example.factory;

import org.example.Army;
import org.example.Castle;
import org.example.King;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
