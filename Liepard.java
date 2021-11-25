package com.company;
import ru.ifmo.se.pokemon.*;
public class Liepard extends Purrlion {
    Liepard(String name, int level) {
        super(name, level);
        this.setStats(64, 88, 50, 88, 50, 106);
        this.addMove(new Swift());
    }
}
