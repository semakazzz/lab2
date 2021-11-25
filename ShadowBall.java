package com.company;
import ru.ifmo.se.pokemon.*;
class ShadowBall extends SpecialMove{
    protected ShadowBall(){
        super(Type.GHOST, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    @Override
    protected String describe() {
        return "uses Shadow Ball";
    }
}

