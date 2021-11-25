package com.company;

import ru.ifmo.se.pokemon.*;
public class Purrlion extends Pokemon {
    Purrlion(String name, int level) {
        super(name, level);
        this.addType(Type.DARK);
        this.setStats(41, 50, 37, 50, 37, 66);
        this.addMove(new Tackle());
        this.addMove(new ShadowBall());
    }
}

