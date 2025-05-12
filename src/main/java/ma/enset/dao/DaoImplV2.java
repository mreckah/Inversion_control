package ma.enset.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class DaoImplV2 implements IDao{


    @Override
    public double getdata() {
        System.out.println("version Web Service");
        double temp=25;
        return temp*4;
    }
}
