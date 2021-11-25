package com.company;
import ru.ifmo.se.pokemon.*;
class Rest extends StatusMove {
    protected Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect.sleep(p);
        p.getStat(Stat.HP);
    }
    @Override
    protected String describe(){
        return "uses Rest";
    }
}
