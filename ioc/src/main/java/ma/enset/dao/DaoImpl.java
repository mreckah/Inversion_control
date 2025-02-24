package ma.enset.dao;

public class DaoImpl implements IDao {
    public double getdata(){
        System.out.println("database version");
        double temp=25;
        return temp;
    }
}
