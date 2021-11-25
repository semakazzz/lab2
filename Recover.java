package com.company;

import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove {
    public Recover() {
        super(Type.NORMAL,0,0);
    }
    @Override
        protected String describe() { return "uses Recover"; }
    protected void applySelfEffects(Pokemon p) {
        p.getStat(Stat.HP);
        p.setMod(Stat.HP, 2);}
}

