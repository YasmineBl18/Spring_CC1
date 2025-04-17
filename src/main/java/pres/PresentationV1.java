package pres;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {

//new = couplage fort

        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d); //inj des dependances via instance static
        //metier.setDao(d); //inj via setter
        System.out.println("RES="+metier.calcul());
    }
}
