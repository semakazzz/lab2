package com.company;
import ru.ifmo.se.pokemon.*;
class Smokescreen extends SpecialMove {
    public Smokescreen(){
        super(Type.NORMAL,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }
    @Override
    protected String describe() {
        return "uses Smokescreen";
    }
}
