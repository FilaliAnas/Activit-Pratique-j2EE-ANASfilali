package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class metierImpl implements IMetier {
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {

        return 50*dao.getData();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
