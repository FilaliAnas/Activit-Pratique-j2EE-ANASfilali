package Pres;

import Dao.IDao;
import Metier.IMetier;
import Metier.metierImpl;
import ext4.daoImpl;


public class pres1 {
    //par Instanciation statique
     public static void main(String[] args) {
        IDao dao=new daoImpl();
        IMetier metier=new metierImpl();
        metier.setDao(dao);
         System.out.println(metier.calcul());





    }





}
