package com.company;
import ru.ifmo.se.pokemon.*;
public class Tackle extends PhysicalMove {
    public Tackle() {
        super(Type.NORMAL, 50, 100);
    }

    @Override
    protected String describe() {
        return "Uses Tackle";
    }
}
