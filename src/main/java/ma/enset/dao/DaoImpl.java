package ma.enset.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {
    public double getdata(){
        System.out.println("database version");
        double temp=25;
        return temp;
    }
}
