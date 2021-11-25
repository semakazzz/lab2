package com.company;
import ru.ifmo.se.pokemon.*;
class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0.0, 0.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "uses Confide";
    }
}