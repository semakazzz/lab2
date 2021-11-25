package com.company;
import ru.ifmo.se.pokemon.*;
 class MuddyWater extends SpecialMove {
    public MuddyWater(){
        super(Type.WATER,90,85);
    }
    @Override
    protected java.lang.String describe(){
        return "Uses Muddy Water";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.chance(0.3);
        effect.stat(Stat.ACCURACY,-1);
        p.addEffect(effect);
    }
}