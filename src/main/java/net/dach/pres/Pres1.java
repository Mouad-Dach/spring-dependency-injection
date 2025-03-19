package net.dach.pres;

import net.dach.ext.DaoImplV2;
import net.dach.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);

        System.out.println("RES= " +metier.calcul());
    }
}
