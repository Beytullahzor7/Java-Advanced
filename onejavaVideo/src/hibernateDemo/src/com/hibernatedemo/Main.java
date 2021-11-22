package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		//Unit of Work
		Session session = factory.getCurrentSession(); //oluþan factoryden bir session almam lazým
		
		try {
			session.beginTransaction();
			//HQL-->Hibernate Query Language
			//Select * from city
			//from City c where c.countryCode='TUR' AND c.district='Ankara'
			//from City c where c.name LIKE '%kar%'
			//ASC-Ascending
			//DESC-Descending
			/*
			 * List<City> cities =
			 * session.createQuery("from City c where c.CountryCode='TUR'").getResultList();
			 * 
			 * for(City city:cities) { System.out.println(city.getName()); }
			 */
			 City city = new City();
			 city.setName("Düzce");
			 city.setCountryCode("TUR");
			 city.setDistrict("Karadeniz");
			 city.setPopulation(800);
			 
			 session.save(city);
			/*
			 * List<String> countryCodes =
			 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
			 * ).getResultList();
			 * 
			 * for(String countryCode:countryCodes) { System.out.println(countryCode); }
			 */
			
			//INSERT
//			City city =new City();
//			city.setName("Düzce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(100000);
//			session.save(city);
			
			//UPDATE
			//City city = session.get(City.class, 4086);
			//city.setPopulation(110000);			
			//session.save(city);
			
			//CRUD Create Read Update Delete
			
			//DELETE
			/*City city =session.get(City.class, 4086);
			session.delete(city);*/
			
			
			
			session.getTransaction().commit(); //mevcut transactionu gerçekleþtir yani commit ederek onayla
			System.out.println("Þehir güncellendi");
		}finally {
			factory.close();
		}
				

	}

}
