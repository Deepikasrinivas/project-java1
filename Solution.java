package org.model;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class Solution {	

		public static void main(String[] args) {
			Stock stock = new Stock();
			stock.setProductName("apple");
			stock.setQuantity(6);
			stock.setNetWeight("1kg");
			stock.setPrice(120.0f);
			stock.setDateOfDelievery("11-08-2017");
			Address address=new Address();
			address.setFirstLine("Thimmanaikkan palayam");
			address.setSecondLine("morattupalayam(p.o)");
			address.setCity("Tirupur");
			address.setPinCode(638752);
			stock.setDelieveryAddress(address);
			Stock stock1 = new Stock();
			stock1.setProductName("orange");
			stock1.setQuantity(5);
			stock1.setNetWeight("500gm");
			stock1.setPrice(60.0f);
			stock1.setDateOfDelievery("12-08-2017");
			Address address1=new Address();
			address1.setFirstLine("kallakurchi");
			address1.setSecondLine("villupuram(dt)");
			address1.setCity("chennai");
			address1.setPinCode(641032);
			stock1.setDelieveryAddress(address1);
			Stock stock2 = new Stock();
			stock2.setProductName("strawberry");
			stock2.setQuantity(15);
			stock2.setNetWeight("250gm");
			stock2.setPrice(200f);
			stock2.setDateOfDelievery("13-08-2017");
			Address address2=new Address();
			address2.setFirstLine("myleripalayam");
			address2.setSecondLine("othakkal mandapam(p.o)");
			address2.setCity("coimbatore");
			address2.setPinCode(641031);
			stock2.setDelieveryAddress(address2);
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			session.beginTransaction();
			session.save(stock);
			session.save(stock1);
			session.save(stock2);
			stock2.getId();
			session.delete(stock1);
			stock2.setQuantity(5000);
			session.update(stock2);
			
			session.getTransaction().commit();
			session.close();
		}

	}
