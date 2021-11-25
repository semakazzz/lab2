package com.company;
import ru.ifmo.se.pokemon.*;
class Swift extends SpecialMove {
    public Swift() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, 6);
    }

    @Override
    protected String describe() {
        return "uses Swift";
    }
}
