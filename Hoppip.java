package com.company;
import ru.ifmo.se.pokemon.*;
public class Hoppip extends Pokemon {
    Hoppip(String name, int level) {
        super(name, level);
        this.addType(Type.FLYING);
        this.setStats(35, 35, 40, 35, 55, 50);
        this.addMove(new Rest());
        this.addMove(new Facade());
    }
}