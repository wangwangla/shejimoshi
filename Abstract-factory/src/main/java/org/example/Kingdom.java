package org.example;

import org.example.factory.KingdomFactory;
import org.example.factory.impl.EleKingdomFactory;
import org.example.factory.impl.OrcKingdomFactory;

public class Kingdom {
    public static class FactoryMaker{
        public enum KingdomType{
            ELF,ORC
        }

        public static KingdomFactory makeFactory(KingdomType type){
            switch(type){
                case ELF:
                    return new EleKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
            }
            return null;
        }
    }
}
