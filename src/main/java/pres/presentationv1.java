package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class presentationv1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("RES= "+metier.calcul());
    }
}
