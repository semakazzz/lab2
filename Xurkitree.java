package com.company;
import ru.ifmo.se.pokemon.*;
public class Xurkitree extends Pokemon {
    Xurkitree(String name, int level) {
        super(name, level);
        this.addType(Type.ELECTRIC);
        this.setStats(83, 89, 71, 173, 71, 83);
        this.addMove(new Recover());
        this.addMove(new WorkUp());
        this.addMove(new EnergyBall());
        this.addMove(new BulkUp());
    }
}

