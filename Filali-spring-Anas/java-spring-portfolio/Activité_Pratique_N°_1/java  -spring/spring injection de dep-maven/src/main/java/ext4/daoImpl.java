package ext4;

import Dao.IDao;

public class daoImpl implements IDao {
    public double getData(){
        System.out.println("micro service version");
         double data=60;
        return data;
    }

}
