package ma.enset.metier;

import ma.enset.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl(){};

    @Override
    public double calcul() {
        double t= dao.getdata();
        double res=t*23;
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }

}
