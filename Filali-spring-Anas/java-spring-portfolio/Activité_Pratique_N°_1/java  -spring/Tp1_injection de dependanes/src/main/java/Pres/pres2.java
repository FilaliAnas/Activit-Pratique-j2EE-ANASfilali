package Pres;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2  {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("Config.txt"));
            String daoClassname = scanner.next();
            String metierClassName = scanner.next();
            Class<?> cdao = Class.forName(daoClassname);
            IDao dao = (IDao) cdao.newInstance();
            Class<?> cmetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cmetier.newInstance();
            Method meth = cmetier.getMethod("setDao", IDao.class);
            try {
                meth.invoke(metier, dao);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            System.out.println(metier.calcul());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
