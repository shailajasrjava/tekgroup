import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class loginManager {
	private Session session;
    private int count = 0;

    public boolean isValidLogin(String uname, String pass) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();
        String query = "select reg.username,reg.password from UserRegistration as reg where reg.username='" + uname + "' and reg.password='" + pass + "'";
        Query DBquery = session.createQuery(query);
        for (Iterator it = DBquery.iterate(); it.hasNext();) {            it.next();
            count++;
        }
        System.out.println("Total rows: " + count);
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
