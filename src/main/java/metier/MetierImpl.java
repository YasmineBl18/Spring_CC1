package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    /* * est du couplage faible : dependre des interfaces
    * variable dao peut recevoir un objet daoimpl de n'importe quelle classe qui impl la meme interface
    * private IDao dao = new DaoImpl();
    */
    private IDao dao=null;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }
public void setDao(IDao dao) {
        this.dao = dao;
}
}
