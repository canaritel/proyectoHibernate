package config;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Declaramos todas las etiquetas creadas en el fichero hibernate.cfg.xml
 *
 * @author telev
 */
public class HibernateUtil {

    static Session session;

    public static Session getCurrentSessionFromConfig() {
        try {

            // SessionFactory in Hibernate 5 example
            Configuration config = new Configuration();
            config.configure();
            // local SessionFactory bean created
            SessionFactory sessionFactory = config.buildSessionFactory();
            session = sessionFactory.getCurrentSession();

        } catch (HibernateException e) {
            System.err.println("Error HibernateUtil :" + e);
        }
        return session;
    }

}
