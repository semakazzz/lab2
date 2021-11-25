package com.company;

import ru.ifmo.se.pokemon.*;

public class Battleground{
    public static void main(String[] args) {
        Battle b = new Battle();
      b.addAlly(new Xurkitree("Matvey",1));
      b.addAlly(new Purrlion("Ilya",1));
      b.addAlly(new Liepard("Lerochka",1));
      b.addFoe(new Hoppip("Zahar",1));
      b.addFoe(new Skiploom("Sglypa",1));
      b.addFoe(new Jumpluff("Sema",1));
        b.go();
    }
}
