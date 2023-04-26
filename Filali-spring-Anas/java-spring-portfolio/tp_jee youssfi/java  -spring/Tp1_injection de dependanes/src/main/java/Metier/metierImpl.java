package Metier;

import Dao.IDao;

public class metierImpl implements IMetier {
    IDao dao=null;
    @Override
    public double calcul() {

        return 50*dao.getData();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
