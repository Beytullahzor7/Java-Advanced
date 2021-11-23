package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;

@Repository
public class HibernateCityDal implements ICityDal {
	
	private EntityManager entityManager;

	@Autowired //jpa bizim için gerekli olan tüm enjeksiyonları gerçekleştirdi bu anotasyon ile
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<City> getAll() { //hibernate ile jpayı kullanarak hızlıca işlemi gerçekleştirdik
		Session session =  entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City",City.class).getResultList();
		return cities;
	}

	@Override
	public void add(City city) {
		Session session =  entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void update(City city) {
		Session session =  entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		Session session =  entityManager.unwrap(Session.class);
		session.delete(city);
		
	}

	@Override
	public City getById(int id) {
		Session session =  entityManager.unwrap(Session.class);
		
		City city = session.get(City.class, id);
		return city;
	}

}
