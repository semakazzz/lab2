package com.company;
import ru.ifmo.se.pokemon.*;
public class Skiploom extends Hoppip {
    Skiploom(String name, int level) {
        super(name, level);
        this.setStats(55, 45, 50, 45, 65, 80);
        this.addMove(new MuddyWater());
    }
}
