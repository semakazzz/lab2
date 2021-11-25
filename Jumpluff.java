package com.company;
import ru.ifmo.se.pokemon.*;
public class Jumpluff extends Skiploom {
    Jumpluff(String name, int level) {
        super(name, level);
        this.setStats(75, 55, 70, 55, 95, 110);
        this.addMove(new Smokescreen());
    }
}
