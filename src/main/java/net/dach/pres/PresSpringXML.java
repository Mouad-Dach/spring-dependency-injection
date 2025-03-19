package net.dach.pres;

import net.dach.dao.IDao;
import net.dach.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) springContext.getBean(IMetier.class);
        System.out.println("Resultat= "+metier.calcul());
    }

}
