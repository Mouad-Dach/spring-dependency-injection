package net.dach.metier;

import net.dach.dao.IDao;
import net.dach.ext.DaoImplV2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }


  @Override
    public double calcul(){

        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);

        return res;
  }

  public void setDao(IDao dao) {
        this.dao = dao;
  }
}
