package hibernateandjpa.project2.Buissnes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hibernateandjpa.project2.demo.ICitiyDal;
import hibernateandjpa.project2.entity.City;

// bu class bizni interfacemizni clasidir

@Service // bu class bir ish katlami ekanligini dasturga bildiradi
public class CityManager implements ICityService {

	private ICitiyDal citydal; // bunu yuklash orqali biz buisness katlamizni  dat acsesimizla bogladik
	
	@Autowired //bu bizga ICitiyDalni chozishimizga yordam beradi yani 
	public CityManager(ICitiyDal citydal) {
		this.citydal = citydal;
	}

	@Override
	@Transactional
	public List<City> getall() {
		// TODO Auto-generated method stub
		return this.citydal.getall();// bu yerda citydalni getall atributini chaqirdik
	}


	@Override
	@Transactional
	public void add(City city) {
		// TODO Auto-generated method stub
		this.citydal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		// TODO Auto-generated method stub
		this.citydal.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		// TODO Auto-generated method stub
		this.citydal.delete(city);
	}

	

}
