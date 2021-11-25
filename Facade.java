package com.company;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70,100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        Status enemy = p.getCondition();
        if (enemy.equals(Status.BURN) || enemy.equals(Status.PARALYZE) || enemy.equals(Status.POISON) ){
            p.setMod(Stat.HP,(int) v*2);
        }
        else{
            p.setMod(Stat.HP,(int) v);
        }
    }

    @Override
    protected String describe() {
        return "Uses Facade";
    }
}