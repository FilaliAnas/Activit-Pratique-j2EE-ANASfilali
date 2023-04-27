package Dao;

public class daoImpl1 implements IDao{
    @Override
    public double getData() {
        System.out.println("version data");
        int data=50;
        return data;
    }
}
