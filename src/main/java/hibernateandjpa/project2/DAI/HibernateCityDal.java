package hibernateandjpa.project2.demo;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hibernateandjpa.project2.entity.City;
import jakarta.persistence.EntityManager;

@Repository // shu onki projeckta bu foydalinalyotgani haqida malumot beradi yani boshqa kun hibernatedan boshqa nrsa foydalansak buni ochirib osha foydalandigan faylimizga qoyamiz
public class HibernateCityDal implements ICitiyDal{

	private EntityManager entitiymanager; // avtomatik bir shakilda hibernate bilan ishlashimiz uchun kerakli boladigan construktorni tayorlashimizga yordamchi boladi
	
	//construktorni tayyrolash uchun sorce/contructor field
	
	
	
	@Autowired  // bizni hibernatedaki factory va sessionlarni avtomatik tayorlashimizga yordamchi boladi 
	public HibernateCityDal(EntityManager entitiymanager) {
		this.entitiymanager = entitiymanager;
	}
	
	@Override
	@Transactional // bu bizni hibernateda sessionni ach kapat ishlarimizni avto shaklida bajaradi 
	// bu olay AOP olarak geciyor
	//AOP -Aspect Oriented Programing biz ni kodimizda avtoshakilda oxhilish va yopilishnio bajaradi
	public List<City> getall() {
		Session session = entitiymanager.unwrap(Session.class); // buyerda jpa hibernatega oid barcha kodlarni bajaryabdi
		List<City> cities = session.createQuery("from city", City.class).getResultList();
		return cities;
		// getall ni chaqirganda ortiq barcha shaharlar keladi
	}


	
	
	@Override
	public void add(City city) {
		
		
	}

	@Override
	public void update(City city) {
		
	}

	@Override
	public void delete(City city) {
		
	}
		
	
	
	
	
}
