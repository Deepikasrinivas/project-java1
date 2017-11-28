package org.login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution1 {	

	public static void main(String[] args) {
		Customer_details d = new Customer_details();
		d.setCust_Name("Deepika");
		d.setCust_mailid("deepikasrini98@gmail.com");
		d.setCust_phoneno("9894491031");
		Address address=new Address();
		address.setFirstLine("Thimmanaikkan palayam");
		address.setSecondLine("morattupalayam(p.o)");
		address.setCity("Tirupur");
		address.setPinCode(638752);
		d.setAddress(address);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(d);
		d.getId();
		session.getTransaction().commit();
		session.close();
	}

}
