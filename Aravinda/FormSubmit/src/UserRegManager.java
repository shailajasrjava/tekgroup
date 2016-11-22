
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UserRegManager {
	public void userInsert(String uname, String pass, String email) {
        try {
         
           Configuration config = new Configuration().configure();
           SessionFactory factory = config.buildSessionFactory();
           Session session = factory.openSession();
           Transaction trans=session.beginTransaction();


           UserRegistration reg = new UserRegistration();
          

           reg.setUsername(uname);
           reg.setPassword(pass);
           reg.setEmail(email);
           session.save(reg);
           System.out.println("DONE");
           trans.commit();
       } catch (Exception e) {
           e.printStackTrace();
       }

   }

}
