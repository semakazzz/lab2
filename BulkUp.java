package com.company;
import ru.ifmo.se.pokemon.*;
public class BulkUp extends StatusMove {
    public BulkUp() {
        super(Type.FIGHTING,0,0);
    }

    @Override
    protected String describe() {
        return "uses Bulk Up";
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.DEFENSE, 1);
    }
}
