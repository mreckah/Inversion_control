package ma.enset.presentation;

import ma.enset.dao.DaoImpl;
import ma.enset.metier.MetierImpl;

public class Version1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
